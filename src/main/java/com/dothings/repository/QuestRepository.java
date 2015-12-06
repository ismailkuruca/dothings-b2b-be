package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dothings.model.User;
import com.dothings.model.activity.Quest;

public interface QuestRepository extends JpaRepository<Quest, Long>{
	
	@Query("SELECT COUNT(*) FROM Quest q WHERE q.createdBy = :user")
	public abstract Integer getCountByUser(@Param("user") User u);

}
