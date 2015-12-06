package com.dothings.model.activity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "question")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Question extends BaseActivity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
