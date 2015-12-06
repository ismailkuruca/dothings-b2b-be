package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dothings.model.QuestCompletion;
import com.dothings.model.User;

public interface QuestCompletionRepository extends JpaRepository<QuestCompletion, Long>{

	
	@Query("SELECT COUNT(*) FROM QuestCompletion q WHERE q.user = :user")
	public abstract Integer getCountByUser(@Param("user") User u);
}
