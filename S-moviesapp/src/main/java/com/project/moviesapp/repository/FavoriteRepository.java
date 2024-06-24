package com.project.moviesapp.repository;

import com.project.moviesapp.model.Favorite;
import org.springframework.data.repository.CrudRepository;

public interface FavoriteRepository  extends CrudRepository<Favorite, Long> {
}



