package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.activity.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
