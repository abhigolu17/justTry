package com.movie.ticket.admin.service;

import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.movie.ticket.model.Movie;
import com.movie.ticket.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Autowired
	MovieRepository movieRepo;

	public String addMovie(Movie movie, String movieType, MultipartFile file) throws IOException {
		Movie photo = new Movie(movieType);
		
		photo.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        photo.setMovieType(file.getContentType());
        photo = mongoTemplate.insert(photo);
        return photo.getMovieID();
	}

}
