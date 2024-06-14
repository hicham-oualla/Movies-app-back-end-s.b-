package com.project.moviesapp.Controller;

import com.project.moviesapp.model.Series;
import com.project.moviesapp.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/series")
public class SeriesController {

    @Autowired
    private SeriesService seriesService;

    @PostMapping
    public ResponseEntity<Series> createSeries(@RequestBody Series series) {
        Series savedSeries = seriesService.saveseries(series);
        return ResponseEntity.ok(savedSeries);
    }

    @GetMapping
    public ResponseEntity<List<Series>> getAllSeries() {
        List<Series> seriesList = seriesService.getAllseries();
        return ResponseEntity.ok(seriesList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Series> getSeriesById(@PathVariable int id) {
        Series series = seriesService.getFilmById(id);
        if (series == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(series);
    }
}
