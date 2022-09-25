package com.movie.ticket.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movie.ticket.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findBy_id(String _id,String password);
}
