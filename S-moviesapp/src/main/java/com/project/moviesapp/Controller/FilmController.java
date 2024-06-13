package com.project.moviesapp.Controller;

import com.project.moviesapp.model.Film;
import com.project.moviesapp.service.filmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    filmService filmService;
    @GetMapping
//     anotation pour returne une valeure
    @ResponseBody
    public List<Film> getAllFilms() {
        List<Film> films = filmService.getAllFilms();
        return films;
    }

  @PostMapping
    @ResponseBody
    public Film saveFilm(@RequestBody Film film) {
        return filmService.saveFilm(film);
}

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Void> deleteFilm(@PathVariable int id) {
        filmService.deleteFilm(id);
        return ResponseEntity.noContent().build();
    }
}
