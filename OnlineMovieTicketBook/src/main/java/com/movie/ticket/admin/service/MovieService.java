package com.movie.ticket.admin.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.movie.ticket.model.Movie;

public interface MovieService {

	String addMovie(Movie movie, String movieType, MultipartFile file) throws IOException;

}
