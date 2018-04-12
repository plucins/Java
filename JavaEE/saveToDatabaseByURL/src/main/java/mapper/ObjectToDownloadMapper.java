package mapper;

import model.ObjectToDownload;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ObjectToDownloadMapper extends AbstractMapper<ObjectToDownload> {

    private static final String FIND = "SELECT * FROM Downloaded WHERE id=?";
    private static final String SELECT = "SELECT id, fileName, url FROM Downloaded";
    private static final String INSERT = "INSERT INTO Downloaded (fileName,url,file) VALUES (?,?,?)";
    private static final String UPDATE = "UPDATE Downloaded SET(fileName, url,file) = (?,?,?) WHERE id = ?";
    private static final String DELETE = "DELETE FROM Downloaded WHERE id = ?";

    public ObjectToDownloadMapper(Connection connection) {
        super(connection);
    }


    @Override
    protected String findStatement() {
        return FIND;
    }

    @Override
    protected String insertStatement() {
        return INSERT;
    }

    @Override
    protected String updateStatement() {
        return UPDATE;
    }

    @Override
    protected String removeStatement() {
        return DELETE;
    }

    @Override
    protected String selectStatement() {
        return SELECT;
    }

    @Override
    public ObjectToDownload doLoad(ResultSet rs,boolean withFile) throws SQLException {
        ObjectToDownload o = new ObjectToDownload();
        o.setId(rs.getInt("id"));
        o.setFileName(rs.getString("fileName"));
        o.setUrl(rs.getString("url"));
        if(withFile){
            o.setFile(rs.getBinaryStream("file"));
        }
        return o;
    }

    @Override
    protected void parametrizeInsertStatement(PreparedStatement statement, ObjectToDownload entity) throws SQLException {
        statement.setString(1,entity.getFileName());
        statement.setString(2,entity.getUrl());
        statement.setBinaryStream(3, entity.getFile());
    }

    @Override
    protected void parametrizeUpdateStatement(PreparedStatement statement, ObjectToDownload entity) throws SQLException {
        parametrizeInsertStatement(statement,entity);
        statement.setLong(1,entity.getId());
    }
}
