package com.project.moviesapp.service;
import com.project.moviesapp.model.Favorite;
import com.project.moviesapp.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public Favorite saveFavorite(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    @Override
    public List<Favorite> getAllFavorites() {
        return (List<Favorite>) favoriteRepository.findAll();
    }

    @Override
    public Favorite getFavoriteById(Long id) {
        Optional<Favorite> optionalFavorite = favoriteRepository.findById(id);
        return optionalFavorite.orElse(null);
    }

    @Override
    public void deleteFavorite(Long id) {
        favoriteRepository.deleteById(id);
    }
}

