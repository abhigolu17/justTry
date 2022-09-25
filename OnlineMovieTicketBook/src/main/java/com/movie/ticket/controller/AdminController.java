package com.movie.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.movie.ticket.admin.service.AdminService;
import com.movie.ticket.model.Admin;
import com.movie.ticket.repository.AdminRepository;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@Autowired
	AdminRepository adminRepo;

	Admin admin;

	@RequestMapping(value = "addAdmin", method = RequestMethod.POST)
	public ModelAndView addAdmin(Admin admin) {
		adminService.addAdmin(admin);

		return new ModelAndView("adminHome");
	}

	@PostMapping("/loginAdmin")
	public ModelAndView loginAdmin(Admin adminLogin, Model model) {
		ModelAndView mav = null;
		Admin admin = adminRepo.findByEmail(adminLogin.getEmail());
		if (admin != null) {
			if (admin.getPassword().equals(adminLogin.getPassword())
					&& admin.getEmail().equals(adminLogin.getEmail())) {
				ResponseEntity.ok(admin);
				mav = new ModelAndView("adminHome");
			} else {
				mav = new ModelAndView("adminRegister");
				mav.addObject("message", "Password is wrong!!");
			}
		} else {
			mav = new ModelAndView("adminRegister");
			mav.addObject("message", "Username or Password is wrong!!");
		}
		return mav;
	}
	
}
