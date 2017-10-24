package mapper;

import Data.DataObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static sun.security.krb5.Confounder.longValue;

public abstract class AbstractMapper<T extends DataObject> {

    private Map<Long, T> loadedMap = new HashMap<>();
    protected Connection connection;

    abstract protected String selectStatement();
    abstract protected String insertStatement();
    abstract protected String updateStatement();
    abstract protected String removeStatement();

    abstract protected T doLoad(ResultSet rs) throws SQLException;
    abstract protected void putDataToInsertStatement(PreparedStatement statement,T entity) throws SQLException;
    abstract protected void putDataToUpdateStatement(PreparedStatement statement,T entity) throws SQLException;

    protected AbstractMapper(Connection connection){
        this.connection = connection;
    }

    public T find(Long id){
        T result = loadedMap.get(id);
        if(result != null){
            return result;
        }
        PreparedStatement selectStatement = null;
        try{
            selectStatement = connection.prepareStatement(selectStatement());
            selectStatement.setLong(1,id.longValue());
            ResultSet rs = selectStatement.executeQuery();
            rs.next();
            result = load(rs);
            return result;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void update(T entity){
        PreparedStatement updateStatement = null;
        try{
            updateStatement = connection.prepareStatement(updateStatement());
            putDataToUpdateStatement(updateStatement,entity);
            updateStatement.executeUpdate();
            loadedMap.put((long) entity.getId(),entity);
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void add(T entity){
        PreparedStatement addStatement = null;
        try{
            addStatement = connection.prepareStatement(insertStatement());
            putDataToInsertStatement(addStatement,entity);
            addStatement.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
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

