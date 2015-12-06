package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.activity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{

}
