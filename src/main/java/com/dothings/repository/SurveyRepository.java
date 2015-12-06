package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.activity.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long>{

}
