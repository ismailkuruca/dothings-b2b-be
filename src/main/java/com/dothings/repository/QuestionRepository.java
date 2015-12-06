package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.activity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
