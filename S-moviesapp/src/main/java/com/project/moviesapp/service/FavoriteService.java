package com.project.moviesapp.service;

import com.project.moviesapp.model.Favorite;

import java.util.List;

public interface FavoriteService {
    Favorite saveFavorite(Favorite favorite);
    List<Favorite> getAllFavorites();
    Favorite getFavoriteById(Long id);
    void deleteFavorite(Long id);
}
