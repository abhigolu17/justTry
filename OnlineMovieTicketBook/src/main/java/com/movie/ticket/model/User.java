package com.movie.ticket.model;

import org.springframework.data.annotation.Id;

public class User {

//	@Indexed(unique = true)
	@Id
	private String _id;
	private String fName;
	private String lName;
	private String gender;
	private String email;
	private Long phone;
	private String address;
	private String password;



	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String _id, String fName, String lName, String gender, String email, Long phone, String address,
			String password) {
		super();
		this._id = _id;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.password = password;
	}

}
