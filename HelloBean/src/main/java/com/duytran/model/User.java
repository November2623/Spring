package com.duytran.model;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;



public class User {
	@NotEmpty
	private String name;
	@Length(min=6, max=12)
	private String password;
	private int id;
	private List<String> favourites;
	private String gender;
	private String about;
	private boolean acceptAgreement;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public boolean isAcceptAgreement() {
		return acceptAgreement;
	}
	public void setAcceptAgreement(boolean acceptAgreement) {
		this.acceptAgreement = acceptAgreement;
	}
	public List<String> getFavourites() {
		return favourites;
	}
	public void setFavourites(List<String> favourites) {
		this.favourites = favourites;
	}
	
}
