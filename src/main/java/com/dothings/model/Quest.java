package com.dothings.model;

import java.util.Date;

public class Quest {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quest.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quest.end_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Date endDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quest.loc_lat
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private String locLat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quest.loc_lon
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private String locLon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quest.start_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Date startDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quest.id
     *
     * @return the value of quest.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quest.id
     *
     * @param id the value for quest.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quest.end_date
     *
     * @return the value of quest.end_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quest.end_date
     *
     * @param endDate the value for quest.end_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quest.loc_lat
     *
     * @return the value of quest.loc_lat
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public String getLocLat() {
        return locLat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quest.loc_lat
     *
     * @param locLat the value for quest.loc_lat
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setLocLat(String locLat) {
        this.locLat = locLat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quest.loc_lon
     *
     * @return the value of quest.loc_lon
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public String getLocLon() {
        return locLon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quest.loc_lon
     *
     * @param locLon the value for quest.loc_lon
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setLocLon(String locLon) {
        this.locLon = locLon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quest.start_date
     *
     * @return the value of quest.start_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quest.start_date
     *
     * @param startDate the value for quest.start_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", endDate=").append(endDate);
        sb.append(", locLat=").append(locLat);
        sb.append(", locLon=").append(locLon);
        sb.append(", startDate=").append(startDate);
        sb.append("]");
        return sb.toString();
    }
}