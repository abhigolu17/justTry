package com.movie.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.movie.ticket.admin.service.UserService;
import com.movie.ticket.model.User;
import com.movie.ticket.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	MongoTemplate mongoTemplate;
	@Autowired
	UserRepository userRepo;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addUser(User user) {
		userService.addUser(user);
		return new ModelAndView("userHome");
	}

	@PostMapping("/loginUser")
	public ModelAndView loginUser(User userLogin, String _id, String password, Model model) {
		ModelAndView mav = null;
		User user = userRepo.findBy_id(_id, password);
		if (user != null) {
			if (user.getPassword().equals(userLogin.getPassword()) && user.get_id().equals(userLogin.get_id())) {
				ResponseEntity.ok(user);
				model.addAttribute("user", user);
				mav = new ModelAndView("userHome");
			} else {
				mav = new ModelAndView("userRegister");
				mav.addObject("message", "Password is wrong!!");
			}
		} else {
			mav = new ModelAndView("userRegister");
			mav.addObject("message", "Username or Password is wrong!!");
		}
		return mav;
	}
}
