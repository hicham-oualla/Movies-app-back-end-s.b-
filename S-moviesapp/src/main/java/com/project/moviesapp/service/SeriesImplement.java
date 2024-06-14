package com.project.moviesapp.service;
import com.project.moviesapp.model.Series;
import com.project.moviesapp.repository.SeriesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SeriesImplement implements SeriesService{

    @Autowired
    private SeriesRepository seriesRepository;



    @Override
    public Series saveseries(Series series) {
        return seriesRepository.save(series);
    }

    @Override
    public List<Series> getAllseries() {
        return (List<Series>) seriesRepository.findAll();
    }

    @Override
    public Series getFilmById(int id) {
        return null;
    }
}
