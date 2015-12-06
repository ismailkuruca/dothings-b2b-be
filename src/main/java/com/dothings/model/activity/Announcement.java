package com.dothings.model.activity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "announcement")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Announcement extends BaseActivity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
