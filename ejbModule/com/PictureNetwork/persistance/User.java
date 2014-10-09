package com.PictureNetwork.persistance;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
// @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name = "t_user")
public class User implements Serializable {

	private int id;
	private String fname;
	private String login;
	private String lname;
	private String Birthday;
	private byte[] photobyte;
	// private Image image;
	private String password;
	private String country;
	private String address;
	private String type;

	private List<Comment> comment;

	private List<Photo> photo;
	
	

	@OneToMany(mappedBy = "user")
	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public User() {

	}

	@OneToMany(mappedBy = "user")
	public List<Photo> getPhoto() {
		return photo;
	}

	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	@Lob
	public byte[] getPhotobyte() {
		return photobyte;
	}

	public void setPhotobyte(byte[] photobyte) {
		this.photobyte = photobyte;
	}

	/*
	 * public Image getImage() { return image; }
	 * 
	 * public void setImage(Image image) { this.image = image; }
	 */

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User(String fname, String login, String lname, String birthday,
			byte[] photobyte, /* Image image, */String password, String country,
			String address, String type) {

		this.fname = fname;
		this.login = login;
		this.lname = lname;
		Birthday = birthday;
		this.photobyte = photobyte;
		// this.image = image;
		this.password = password;
		this.country = country;
		this.address = address;
		this.type = type;
	}
}
