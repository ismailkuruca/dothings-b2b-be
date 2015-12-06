package com.dothings.model;

import java.util.Date;

public class EventCompletion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eventcompletion.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eventcompletion.DATE
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eventcompletion.earned_points
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Integer earnedPoints;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eventcompletion.event_type
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private String eventType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eventcompletion.event_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Long eventId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eventcompletion.participant_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Long participantId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eventcompletion.id
     *
     * @return the value of eventcompletion.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eventcompletion.id
     *
     * @param id the value for eventcompletion.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eventcompletion.DATE
     *
     * @return the value of eventcompletion.DATE
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eventcompletion.DATE
     *
     * @param date the value for eventcompletion.DATE
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eventcompletion.earned_points
     *
     * @return the value of eventcompletion.earned_points
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Integer getEarnedPoints() {
        return earnedPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eventcompletion.earned_points
     *
     * @param earnedPoints the value for eventcompletion.earned_points
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setEarnedPoints(Integer earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eventcompletion.event_type
     *
     * @return the value of eventcompletion.event_type
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eventcompletion.event_type
     *
     * @param eventType the value for eventcompletion.event_type
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eventcompletion.event_id
     *
     * @return the value of eventcompletion.event_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eventcompletion.event_id
     *
     * @param eventId the value for eventcompletion.event_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eventcompletion.participant_id
     *
     * @return the value of eventcompletion.participant_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Long getParticipantId() {
        return participantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eventcompletion.participant_id
     *
     * @param participantId the value for eventcompletion.participant_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eventcompletion
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
        sb.append(", date=").append(date);
        sb.append(", earnedPoints=").append(earnedPoints);
        sb.append(", eventType=").append(eventType);
        sb.append(", eventId=").append(eventId);
        sb.append(", participantId=").append(participantId);
        sb.append("]");
        return sb.toString();
    }
}