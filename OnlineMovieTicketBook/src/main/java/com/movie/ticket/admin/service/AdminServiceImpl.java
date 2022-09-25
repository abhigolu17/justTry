package com.movie.ticket.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.movie.ticket.model.Admin;
import com.movie.ticket.repository.AdminRepository;

@Service
@Component
public class AdminServiceImpl implements AdminService{

	@Autowired(required = true)
	MongoTemplate mongoTemplate;
	
	@Autowired
	AdminRepository adminRepo;

	public Admin addAdmin(Admin admin) {
		return mongoTemplate.insert(admin);		
	}

}
