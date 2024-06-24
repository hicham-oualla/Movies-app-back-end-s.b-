package com.project.moviesapp.Controller;
import com.project.moviesapp.Dto.FavoriteReques;
import com.project.moviesapp.model.Favorite;
import com.project.moviesapp.model.Film;
import com.project.moviesapp.model.Series;
import com.project.moviesapp.model.Users;
import com.project.moviesapp.service.FavoriteService;
import com.project.moviesapp.service.filmService;
import com.project.moviesapp.service.SeriesService;
import com.project.moviesapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @Autowired
    private filmService filmService;

    @Autowired
    private SeriesService seriesService;

    @Autowired
    private UserService usersService;

    @PostMapping
    public ResponseEntity<Favorite> createFavorite(@RequestBody FavoriteReques favoriteRequest) {
        Optional<Film> film = filmService.getFilmById(favoriteRequest.getFilmById());
        Optional<Series> series = Optional.ofNullable(seriesService.getserieById(favoriteRequest.getSeriesId()));
        Optional<Users> user = Optional.ofNullable(usersService.getUserById(favoriteRequest.getUserId()));

        if (!user.isPresent() || (!film.isPresent() && !series.isPresent())) {
            return ResponseEntity.badRequest().build();
        }

        Favorite favorite = new Favorite();
        favorite.setUser(user.get());
        film.ifPresent(favorite::setFilm);
        series.ifPresent(favorite::setSerie);

        Favorite savedFavorite = favoriteService.saveFavorite(favorite);
        return ResponseEntity.ok(savedFavorite);
    }

    @GetMapping
    public ResponseEntity<List<Favorite>> getAllFavorites() {
        List<Favorite> favorites = favoriteService.getAllFavorites();
        return ResponseEntity.ok(favorites);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Favorite> getFavoriteById(@PathVariable Long id) {
        Favorite favorite = favoriteService.getFavoriteById(id);
        if (favorite == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(favorite);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable Long id) {
        favoriteService.deleteFavorite(id);
        return ResponseEntity.noContent().build();
    }
}
