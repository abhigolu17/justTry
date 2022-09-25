package com.movie.ticket.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movie.ticket.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String>{

}
