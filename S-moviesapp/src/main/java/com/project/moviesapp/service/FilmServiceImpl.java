package com.project.moviesapp.service;

import com.project.moviesapp.Dto.FilmDTO;
import com.project.moviesapp.model.Film;
import com.project.moviesapp.repository.filmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        return List.of();
    }



//    public List<FilmDTO> getAllFilms() {
////        return filmRepository.findAll().stream().map(film -> {
////            FilmDTO dto = new FilmDTO();
////            dto.setId_film(film.getId_film());
////            dto.setText(film.getText());
////            dto.setDescription(film.getDescription());
////            dto.setDate_debut(film.getDate_debut());
////            dto.setDate_fin(film.getDate_fin());
////            dto.setSaison(film.getSaison());
////            dto.setGenre(film.getGenre());
////            dto.setCreateur(film.getCreateur());
////            dto.setActeur(film.getActeur());
////            dto.setNote(film.getNote());
////            return dto;
////        }).collect(Collectors.toList());
//    }

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
