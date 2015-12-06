package com.dothings.model.activity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Feedback extends BaseActivity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
