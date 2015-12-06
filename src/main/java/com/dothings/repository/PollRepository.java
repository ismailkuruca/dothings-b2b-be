package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.activity.Poll;

public interface PollRepository extends JpaRepository<Poll, Long>{

}
