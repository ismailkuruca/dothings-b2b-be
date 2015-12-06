package com.dothings.model.activity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.dothings.model.PollAnswer;

@Entity
@Table(name = "poll")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Poll extends BaseActivity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "answer1")
	private String answer1;
	
	@Column(name = "answer2")
	private String answer2;
	
	@Column(name = "answer3")
	private String answer3;
	
	@Column(name = "answer4")
	private String answer4;
	
	@Column(name = "poll_answers")
	@OneToMany(mappedBy = "pollId")
	private List<PollAnswer> pollAnswers;
	
	//Represents whether a poll belongs to a survey; otherwise set to 0
	@Column(name = "survey_id")
	private Long surveyId;
	
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

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public List<PollAnswer> getPollAnswers() {
		return pollAnswers;
	}

	public void setPollAnswers(List<PollAnswer> pollAnswers) {
		this.pollAnswers = pollAnswers;
	}

	public Long getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Long surveyId) {
		this.surveyId = surveyId;
	}

	
}
