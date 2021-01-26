package com.example.reviews.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "reviews")
public class Review {
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "PRODUCTID")
	private String productId;
	@Column(name = "USERID")
	private String userId;
	@Column(name = "PROFILENAME")
	private String profileName;
	@Column(name = "HELPFULNESSNUMERATOR")
	private String helpfulnessNumerator;
	@Column(name = "HELPFULNESSDENOMINATOR")
	private String helpfulnessDenominator;
	@Column(name = "SCORE")
	private String score;
	@Column(name = "TIME")
	private String time;
	@Column(name = "SUMMARY")
	private String summary;
	@Column(name = "TEXT")
	private String text;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getHelpfulnessNumerator() {
		return helpfulnessNumerator;
	}
	public void setHelpfulnessNumerator(String helpfulnessNumerator) {
		this.helpfulnessNumerator = helpfulnessNumerator;
	}
	public String getHelpfulnessDenominator() {
		return helpfulnessDenominator;
	}
	public void setHelpfulnessDenominator(String helpfulnessDenominator) {
		this.helpfulnessDenominator = helpfulnessDenominator;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
