package com.Entry.hotelentry.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Hotel")
public class Hotel {
    @Id
	private String Email;
	private String Mobile;
	private String Fullname;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	@Override
	public String toString() {
		return "Hotel [Email=" + Email + ", Mobile=" + Mobile + ", Fullname=" + Fullname + ", getEmail()=" + getEmail()
				+ ", getMobile()=" + getMobile() + ", getFullname()=" + getFullname() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Hotel(String email, String mobile, String fullname) {
		super();
		Email = email;
		Mobile = mobile;
		Fullname = fullname;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
