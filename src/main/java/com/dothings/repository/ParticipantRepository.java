package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long>{

}
