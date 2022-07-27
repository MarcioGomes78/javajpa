package com.mjgomes.javajpa.entities;

import java.util.Date;

public class Client {

	private Long id;
	private String name;
	private Date birthDate;
	
	public Client() {
	}
	
	public Client(Long id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
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
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
	
}
