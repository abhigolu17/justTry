package com.movie.ticket.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.movie.ticket.admin.service.MovieService;
import com.movie.ticket.model.Movie;


@Controller
@RestController
public class MoviesController {
	
	@Autowired
	MovieService movieService;
	
//	@RequestMapping(value = "addMovie", method = RequestMethod.POST)
//	public ModelAndView addMovie(Movie movie ,MultipartFile image,String movieType) throws Exception{
//		movieService.addMovie(movie,movieType,image);
//		return new ModelAndView("adminHome");
//	}
	@RequestMapping(value = "addMovie", method = RequestMethod.POST)
	public ModelAndView addMovie(Movie movie,String movieType, MultipartFile file) throws Exception{
		movieService.addMovie(movie,movieType,file);
		return new ModelAndView("adminHome");
	}

	@RequestMapping(value = "upload", method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
		File converFile = new File("C:/Users/lenovo/Desktop/fileSave" + file.getOriginalFilename());
		converFile.createNewFile();
		try(FileOutputStream fout = new FileOutputStream(converFile)){
			fout.write(file.getBytes());
		}catch(Exception exe) {
			exe.printStackTrace();
		}
		return "file has uploaded Successfully";
	}
	
}
