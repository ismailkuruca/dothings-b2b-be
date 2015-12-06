package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.activity.BaseActivity;

public interface ActivityRepository extends JpaRepository<BaseActivity, Long>{

	
}
