package com.movie.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
	@GetMapping("/adminHome")
	public String adminHome() {
		return "adminHome";
	}

	@GetMapping("/adminRegister")
	public String adminRegister() {
		return "adminRegister";
	}

	@GetMapping("/userRegister")
	public String usersRegister() {
		return "userRegister";
	}

	@GetMapping("/userHome")
	public String userHome() {
		return "userHome";
	}

	@GetMapping("/uploadMovie")
	public String uploadMovie() {
		return "uploadMovie";
	}

	@GetMapping("/upcomingMovie")
	public String upcomingMovie() {
		return "upcomingMovie";
	}

	@GetMapping("/paymentStatus")
	public String paymentStatus() {
		return "paymentStatus";
	}

	@GetMapping("/allHistory")
	public String allHistory() {
		return "allHistory";
	}

}
