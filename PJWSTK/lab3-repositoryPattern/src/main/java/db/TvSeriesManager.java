package db;


import fields.TvSeries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TvSeriesManager {
    private Connection connection;
    private String url = "jdbs:mysql://";

    private String insertSql = "INSERT INTO TvSeries(tvSeriesName) VALUES(?)";
    private String selectSql = "SELECT * FROM TvSeries";
    private String deleteSql = "DELETE FROM TvSeries WHERE id=?";
    private String updateSql = "UPDATE TvSeries SET (tvSeriesName)=(?) WHERE id=?";

    private PreparedStatement insert;
    private PreparedStatement select;
    private PreparedStatement delete;
    private PreparedStatement update;

    public TvSeriesManager(){

        try {
            connection = DriverManager.getConnection(url);

            insert = connection.prepareStatement(insertSql);
            select = connection.prepareStatement(selectSql);
            delete = connection.prepareStatement(deleteSql);
            update = connection.prepareStatement(updateSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(TvSeries tv){
        try{
            insert.setString(1,tv.getName());

            insert.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void delete(int id){
        try{
            delete.setInt(1,id);
            delete.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void update(TvSeries tv){
        try{
            update.setString(1,tv.getName());
            update.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<TvSeries> listAll(){
        List<TvSeries> result = new ArrayList<TvSeries>();

        try{
            ResultSet rs = select.executeQuery();
            while(rs.next()){
                TvSeries tv = new TvSeries();
                tv.setId(rs.getInt("id"));
                tv.setName(rs.getString("tvSeriesName"));
                result.add(tv);
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return result;
    }
}

