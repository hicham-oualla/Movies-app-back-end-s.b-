package com.project.moviesapp.repository;

import com.project.moviesapp.model.Series;
import org.springframework.data.repository.CrudRepository;

public interface SeriesRepository extends CrudRepository<Series, Integer> {
}
