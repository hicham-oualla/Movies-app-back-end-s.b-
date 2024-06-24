package com.project.moviesapp.service;



import com.project.moviesapp.model.Series;

import java.util.List;

public interface SeriesService {
    Series saveseries(Series series);
    List<Series> getAllseries();
    Series getserieById(int id);

}
