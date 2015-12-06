package com.dothings.model.activity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

import com.dothings.model.User;

@Entity
@Table(name = "activity")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "ACTIVITY_TYPE", discriminatorType = DiscriminatorType.STRING)
public class BaseActivity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description", columnDefinition = "TEXT")
	private String description;

	@Column(name = "create_date")
	private Date createDate;

	@JoinColumn(name = "created_by")
	@OneToOne
	private User createdBy;

	@Column(name = "photo_link")
	private String photo;
	
	// Visibility will be a list of integers seperated with comma, default 0 is
	// public
	@Column(name = "visibility")
	private String visibility;
	
	@Column(name = "award")
	private Double award;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public List<Integer> getVisibilityList() {
		List<Integer> result = new ArrayList<>();
		if (StringUtils.isNotEmpty(visibility)) {
			String[] splittedValues = visibility.split(",");
			for (String s : splittedValues) {
				try {
					result.add(Integer.parseInt(s));
				} catch (NumberFormatException nfe) {
					// TODO log
				}
			}
		}
		return result;
	}

	public void setVisibilityList(List<Integer> visibilityList) {
		this.visibility = visibilityList.stream().map(i -> Integer.toString(i)).collect(Collectors.joining(","));
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Double getAward() {
		return award;
	}

	public void setAward(Double award) {
		this.award = award;
	}
}
