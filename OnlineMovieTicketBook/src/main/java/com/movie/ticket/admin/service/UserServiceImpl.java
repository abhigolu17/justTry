package com.movie.ticket.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.movie.ticket.model.User;

@Service
@Component
public class UserServiceImpl implements UserService{

	@Autowired(required = true)
	MongoTemplate mongoTemplate;
	
	public User addUser(User user) {
		return mongoTemplate.insert(user);
	}

}
