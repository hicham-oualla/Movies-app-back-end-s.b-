package com.project.moviesapp.Controller;

import com.project.moviesapp.Dto.FilmDTO;
import com.project.moviesapp.model.Film;
import com.project.moviesapp.service.filmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/film")
public class FilmController {

    @Autowired
    private filmService filmService;

    @GetMapping
    @ResponseBody
    public List<FilmDTO> getAllFilms() {
        return filmService.getAllFilms();
    }

    @PostMapping
    @ResponseBody
    public FilmDTO saveFilm(@RequestBody Film film) {
        Film savedFilm = filmService.saveFilm(film);
        return FilmDTO.toDto(savedFilm);
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Void> deleteFilm(@PathVariable int id) {
        filmService.deleteFilm(id);
        return ResponseEntity.noContent().build();
    }
}
