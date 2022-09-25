package com.movie.ticket.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movie.ticket.model.Admin;
import com.movie.ticket.model.User;

public interface AdminRepository extends MongoRepository<Admin, String> {
	
	Admin findByEmail(String email);

}
