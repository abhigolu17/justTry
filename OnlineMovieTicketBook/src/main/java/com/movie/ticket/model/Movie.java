package com.movie.ticket.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

public class Movie {

	@Id
	private String movieID;
	private String movieName;
	private String movieTicket;
	private String movieType;
	private Integer totalSeat;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String date;
	private String time;
	private Binary image;

	public String getMovieID() {
		return movieID;
	}

	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieTicket() {
		return movieTicket;
	}

	public void setMovieTicket(String movieTicket) {
		this.movieTicket = movieTicket;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public Integer getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(Integer totalSeat) {
		this.totalSeat = totalSeat;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Binary getImage() {
		return image;
	}

	public void setImage(Binary image) {
		this.image = image;
	}
	
	public Movie(String movieType) {
		super();
		this.movieType = movieType;
	}

}
