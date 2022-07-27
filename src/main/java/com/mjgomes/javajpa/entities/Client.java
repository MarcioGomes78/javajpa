package com.mjgomes.javajpa.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Long id;
	private String name;
	private String email;
	private Date birthDate;
	
	public Client() {
	}
	
	public Client(Long id, String name, String email, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
 	}

	
}
