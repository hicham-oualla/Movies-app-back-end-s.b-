package com.project.moviesapp.repository;

import com.project.moviesapp.model.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface filmRepository extends CrudRepository<Film, Integer> {
}
