package com.dothings.model.activity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.dothings.model.LatLng;

@Entity
@Table(name = "quest")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Quest extends BaseActivity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "loc_lat")
	private String locationLat;
	
	@Column(name = "loc_lon")
	private String locationLon;

	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
