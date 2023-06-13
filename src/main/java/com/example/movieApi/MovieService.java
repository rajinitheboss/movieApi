package com.example.movieApi;

import java.util.*;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public Optional<movie> getSingleMovie(ObjectId id){
        return movieRepository.findById(id);
    }
    public Optional<movie> getSingleMovieByImdbId(String id){
        return movieRepository.getByImdbId(id);
    }
}
