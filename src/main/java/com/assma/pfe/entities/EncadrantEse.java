package com.assma.pfe.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class EncadrantEse extends User{
	
	private String grade;
	
	private String societe;
	
	
	private LocalDate date;

	public EncadrantEse() {
		super();
	}
	
	public EncadrantEse( String firstname, String lastname,
			  String phone, String email,
			  String password, String grade, String societe, LocalDate date) {
		super(firstname, lastname, phone, email, password);
		this.grade = grade;
		this.societe = societe;
		this.date = date;
	}

	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getSociete() {
		return societe;
	}


	public void setSociete(String societe) {
		this.societe = societe;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}	
	
	
}
