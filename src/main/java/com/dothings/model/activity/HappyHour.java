package com.dothings.model.activity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dothings.model.LatLng;
import com.dothings.model.User;

@Entity
@Table(name = "happy_hour")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class HappyHour extends BaseActivity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "loc_lat")
	private String locationLat;
	
	@Column(name = "loc_lon")
	private String locationLon;
	
	@Transient
	private List<User> attenders;
	
	@Column(name = "start_date")
	private Date startDate;

	public List<User> getAttenders() {
		return attenders;
	}

	public void setAttenders(List<User> attenders) {
		this.attenders = attenders;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getLocationLon() {
		return locationLon;
	}

	public void setLocationLon(String locationLon) {
		this.locationLon = locationLon;
	}

	public String getLocationLat() {
		return locationLat;
	}

	public void setLocationLat(String locationLat) {
		this.locationLat = locationLat;
	}
	
	public LatLng getLocation() {
		return new LatLng(this.locationLat, this.locationLon);
	}
	
	
	
}
