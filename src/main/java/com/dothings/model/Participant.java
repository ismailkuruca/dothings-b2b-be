package com.dothings.model;

import java.util.Date;

public class Participant {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participant.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participant.application_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Date applicationDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participant.event_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Long eventId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participant.participant_team_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Long participantTeamId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column participant.participant_user_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    private Long participantUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participant.id
     *
     * @return the value of participant.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participant.id
     *
     * @param id the value for participant.id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participant.application_date
     *
     * @return the value of participant.application_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Date getApplicationDate() {
        return applicationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participant.application_date
     *
     * @param applicationDate the value for participant.application_date
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participant.event_id
     *
     * @return the value of participant.event_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participant.event_id
     *
     * @param eventId the value for participant.event_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participant.participant_team_id
     *
     * @return the value of participant.participant_team_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Long getParticipantTeamId() {
        return participantTeamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participant.participant_team_id
     *
     * @param participantTeamId the value for participant.participant_team_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setParticipantTeamId(Long participantTeamId) {
        this.participantTeamId = participantTeamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column participant.participant_user_id
     *
     * @return the value of participant.participant_user_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public Long getParticipantUserId() {
        return participantUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column participant.participant_user_id
     *
     * @param participantUserId the value for participant.participant_user_id
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    public void setParticipantUserId(Long participantUserId) {
        this.participantUserId = participantUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
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
        sb.append(", applicationDate=").append(applicationDate);
        sb.append(", eventId=").append(eventId);
        sb.append(", participantTeamId=").append(participantTeamId);
        sb.append(", participantUserId=").append(participantUserId);
        sb.append("]");
        return sb.toString();
    }
}