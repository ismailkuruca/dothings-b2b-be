package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.PollAnswer;

public interface PollAnswerRepository extends JpaRepository<PollAnswer, Long>{

}
