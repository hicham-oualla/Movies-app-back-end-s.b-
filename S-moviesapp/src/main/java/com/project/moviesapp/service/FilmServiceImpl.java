package com.project.moviesapp.service;

import com.project.moviesapp.Dto.FilmDTO;
import com.project.moviesapp.model.Film;
import com.project.moviesapp.repository.filmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements filmService {

    @Autowired
    private filmRepository filmRepository;

    @Override
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public List<FilmDTO> getAllFilms() {
        List<Film> films = (List<Film>) filmRepository.findAll();
        List<FilmDTO> filmDTOs = new ArrayList<>();
        for (Film film : films) {
            filmDTOs.add(FilmDTO.toDto(film));
        }
        return filmDTOs;
    }

    @Override
    public Film getFilmById(int id) {
        Optional<Film> optionalFilm = filmRepository.findById(id);
        return optionalFilm.orElse(null);
    }

    @Override
    public void updateFilm(Film film) {
        if (filmRepository.existsById(film.getId_film())) {
            filmRepository.save(film);
        }
    }

    @Override
    public void deleteFilm(int id) {
        filmRepository.deleteById(id);
    }
}
