package com.dothings.model.activity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "survey")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Survey extends BaseActivity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Transient
	public List<Poll> pollList;
	
	@Transient
	public List<Question> questionList;

	public List<Poll> getPollList() {
		return pollList;
	}

	public void setPollList(List<Poll> pollList) {
		this.pollList = pollList;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
}
