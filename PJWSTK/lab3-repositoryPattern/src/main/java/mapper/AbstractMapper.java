package mapper;

import fields.DomainObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMapper<T extends DomainObject> {
    private Map<Long, T> loadedMap = new HashMap<Long, T>();
    protected Connection connection;

    abstract protected String findStatement();
    abstract protected String insertStatement();
    abstract protected String updateStatement();
    abstract protected String removeStatement();

    abstract protected T doLoad(ResultSet rs) throws SQLException;
    abstract protected void parametrizeInsertStatement(PreparedStatement statement, T entity) throws SQLException;
    abstract protected void parametrizeUpdateStatement(PreparedStatement statement, T entity) throws SQLException;

    protected AbstractMapper(Connection connection){
        this.connection = connection;
    }

    public T find(Long id){
        T result = loadedMap.get(id);
        if(result != null){
            return result;
        }
        PreparedStatement findStatement = null;
        try{
            findStatement = connection.prepareStatement(findStatement());
            findStatement.setLong(1, id.longValue());
            ResultSet rs = findStatement.executeQuery();
            rs.next();
            result = load(rs);
            return result;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void add(T entity){
        PreparedStatement addStatement = null;
        try{
            addStatement = connection.prepareStatement(insertStatement());
            parametrizeInsertStatement(addStatement,entity);
            addStatement.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void update(T entity){
        PreparedStatement updateStatement = null;
        try{
            updateStatement = connection.prepareStatement(updateStatement());
            parametrizeUpdateStatement(updateStatement,entity);
            updateStatement.executeUpdate();
            loadedMap.put((long) entity.getId(),entity);
        }catch(SQLException e){
            throw new RuntimeException();
        }
    }

    public void remove(Long id){
        PreparedStatement removeStatement = null;
        try{
            removeStatement = connection.prepareStatement(removeStatement());
            removeStatement.setLong(1,id);
            removeStatement.executeUpdate();
            loadedMap.remove(id);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    private T load(ResultSet rs) throws SQLException{
        Long id = rs.getLong(1);
        if(loadedMap.containsKey(id)){
            return loadedMap.get(id);
        }
        T result = doLoad(rs);
        loadedMap.put(id,result);
        return result;
    }

}
