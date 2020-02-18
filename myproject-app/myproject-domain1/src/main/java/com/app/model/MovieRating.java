package com.app.model;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name ="MOVIERATING")
public class MovieRating implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	private int rateValue;
	private String commentName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getRateValue() {
		return rateValue;
	}
	public void setRateValue(int rateValue) {
		this.rateValue = rateValue;
	}
	public String getCommentName() {
		return commentName;
	}
	public void setCommentName(String commentName) {
		this.commentName = commentName;
	}
	
	
}
