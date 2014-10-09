package com.PictureNetwork.persistance;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_forum")
public class Forum implements Serializable {

	private int idforum;
	private String title;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdforum() {
		return idforum;
	}

	public void setIdforum(int idforum) {
		this.idforum = idforum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Forum() {

	}

	public Forum(String title) {

		this.title = title;

	}

}
