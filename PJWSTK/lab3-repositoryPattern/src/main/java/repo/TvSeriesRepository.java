package repo;

import fields.TvSeries;
import mapper.TvSeriesMapper;

import java.sql.Connection;

public class TvSeriesRepository {

    private Connection connection;
    private TvSeriesMapper tvSeriesMapper;

    public TvSeriesRepository(Connection connection){
        this.connection = connection;
        this.tvSeriesMapper = new TvSeriesMapper(connection);
    }

    public void add(TvSeries tv){
        tvSeriesMapper.add(tv);
    }

    public void modify(TvSeries tv){
        tvSeriesMapper.update(tv);
    }

    public void remove(TvSeries tv){
        tvSeriesMapper.remove((long) tv.getId());
    }

    public TvSeries find(int id){
        return tvSeriesMapper.find((long) id);
    }
}

