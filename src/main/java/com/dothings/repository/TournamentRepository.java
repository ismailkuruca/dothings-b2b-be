package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.activity.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Long>{

}
