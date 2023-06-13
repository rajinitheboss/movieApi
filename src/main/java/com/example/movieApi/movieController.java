package com.example.movieApi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/v1/movies")
public class movieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<movie>> getAllMovies(){
        return new ResponseEntity<List<movie>>(movieService.getAllMovies(),HttpStatus.OK);
    }
    @GetMapping("/{Id}")
    public ResponseEntity<Optional<movie>> getSingleMovie(@PathVariable ObjectId Id){
        return new ResponseEntity<Optional<movie>>(movieService.getSingleMovie(Id),HttpStatus.OK);
    }
    @GetMapping("/imdb/{imdbId}")
    public ResponseEntity<Optional<movie>> getSingleMovieByImdb(@PathVariable String imdbId){
        return new ResponseEntity<Optional<movie>>(movieService.getSingleMovieByImdbId(imdbId),HttpStatus.OK);
    }
}
