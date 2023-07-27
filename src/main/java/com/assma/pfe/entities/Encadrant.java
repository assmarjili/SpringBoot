package com.assma.pfe.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity

public class Encadrant extends User{

	@Size(max = 20)
	private String grade;
	
	private LocalDate date;


	public Encadrant() {
		super();
	}
	
	public Encadrant( String firstname, String lastname,
			 String phone, String email,
		String password, String grade,
			LocalDate date) {
		super(firstname, lastname, phone, email, password);
		this.grade = grade;
		this.date = date;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
