package com.dothings.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Email
	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "display_name")
	private String displayName;

	@Column(name = "department")
	private String department;
	
	@Column(name = "title")
	private String title;

	@Column(name = "date_created")
	private Date creationDate;

	@Column(name = "profile_picture")
	private String profilePicture;

	@Column(name = "last_login_date")
	private Date lastLoginDate;

	@Column(name = "rank")
	private Integer rank;

	@Column(name = "experience")
	private Integer experience;
	
	@Column(name = "walk")
	private Double walkAmount;
	
	@Column(name = "water")
	private Double waterAmount;
	
	@Column(name = "sleep")
	private Double sleepAmount;

	@Transient
	private Double currentWalk;
	
	@Transient
	private Double currentWater;
	
	@Transient
	private Double currentSleep;
	
	@Transient
	private Double currentHappiness;
	
	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public void setDisplayName(final String name) {
		this.displayName = name;
	}

	@JsonIgnore
	public int getSignInMethodCount()
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		int count = 0;

		if (this.getPassword() != null) {
			count++;
		}

		return count;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getWalkAmount() {
		return walkAmount;
	}

	public void setWalkAmount(Double walkAmount) {
		this.walkAmount = walkAmount;
	}

	public Double getWaterAmount() {
		return waterAmount;
	}

	public void setWaterAmount(Double waterAmount) {
		this.waterAmount = waterAmount;
	}

	public Double getSleepAmount() {
		return sleepAmount;
	}

	public void setSleepAmount(Double sleepAmount) {
		this.sleepAmount = sleepAmount;
	}

	public Double getCurrentWalk() {
		return currentWalk;
	}

	public void setCurrentWalk(Double currentWalk) {
		this.currentWalk = currentWalk;
	}

	public Double getCurrentWater() {
		return currentWater;
	}

	public void setCurrentWater(Double currentWater) {
		this.currentWater = currentWater;
	}

	public Double getCurrentSleep() {
		return currentSleep;
	}

	public void setCurrentSleep(Double currentSleep) {
		this.currentSleep = currentSleep;
	}

	public Double getCurrentHappiness() {
		return currentHappiness;
	}

	public void setCurrentHappiness(Double currentHappiness) {
		this.currentHappiness = currentHappiness;
	}
}
