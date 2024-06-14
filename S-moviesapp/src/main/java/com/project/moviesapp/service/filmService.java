package com.project.moviesapp.service;

import com.project.moviesapp.Dto.FilmDTO;
import com.project.moviesapp.model.Film;

import java.util.List;

public interface filmService {
    Film saveFilm(Film film);
    List<FilmDTO> getAllFilms();
    Film getFilmById(int id);
    void updateFilm(Film film);
    void deleteFilm(int id);
}

