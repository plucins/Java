package mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class  AbstractMapper<T extends DomainObject> {
    private Map<Long, T> loadedMap = new HashMap<>();
    private Connection connection;

    abstract protected String findStatement();
    abstract protected String selectStatement();
    abstract protected String insertStatement();
    abstract protected String updateStatement();
    abstract protected String removeStatement();
    abstract protected String tableExistStatement();

    abstract public T doLoad(ResultSet rs, boolean withFile) throws SQLException;
    abstract protected void parametrizeInsertStatement(PreparedStatement statement, T entity) throws SQLException;
    abstract protected void parametrizeUpdateStatement(PreparedStatement statement, T entity) throws SQLException;

    AbstractMapper(Connection connection){
        this.connection = connection;
    }

    public T find(Long id, boolean withFile){
        T result = loadedMap.get(id);
        if(result != null){
            return result;
        }
        PreparedStatement findStatement;

        try {
            findStatement = connection.prepareStatement(findStatement());
            findStatement.setLong(1, id);
            ResultSet rs = findStatement.executeQuery();
            rs.next();
            result = load(rs,withFile);
            return result;

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public List<T> select(){
        PreparedStatement selectStatement;
        List<T> list = new ArrayList<>();
        try{
            selectStatement = connection.prepareStatement(selectStatement());
            ResultSet rs = selectStatement.executeQuery();
            while (rs.next()){
                list.add(load(rs,false));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    public void add(T entity){
        PreparedStatement addStatement;
        try{
            addStatement = connection.prepareStatement(insertStatement());
            parametrizeInsertStatement(addStatement,entity);
            addStatement.executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void update(T entity){
        PreparedStatement updateStatement;
        try{
            updateStatement = connection.prepareStatement(updateStatement());
            parametrizeUpdateStatement(updateStatement,entity);
            updateStatement.executeUpdate();
            loadedMap.put((long) entity.getId(),entity);
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

    public void remove(Long id){
        if(find(id,false) == null){
            throw new IllegalArgumentException();
        }

        PreparedStatement removeStatement;

        try{
            removeStatement = connection.prepareStatement(removeStatement());
            removeStatement.setLong(1,id);
            removeStatement.executeUpdate();
            loadedMap.remove(id);
        } catch (SQLException e) {
            throw  new RuntimeException();
        }
    }

    private T load(ResultSet rs, boolean withFile) throws SQLException{
        Long id = rs.getLong(1);
        if(loadedMap.containsKey(id)){
            return loadedMap.get(id);
        }

        T result = doLoad(rs, withFile);
        loadedMap.put(id,result);
        return result;
    }

    public void createTableIfNotExist(){
        PreparedStatement createIfNotExistStatement;
        try {
            createIfNotExistStatement = connection.prepareStatement(tableExistStatement());
            createIfNotExistStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
