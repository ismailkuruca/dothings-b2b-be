package com.dothings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dothings.model.HealthDetailEntry;
import com.dothings.model.HealthDetailType;
import com.dothings.model.User;

public interface HealthDetailRepository extends JpaRepository<HealthDetailEntry, Long>{
	
	@Query("SELECT * FROM HealthDetailEntry h WHERE h.createDate > current_date() AND h.user = :user")
	public abstract List<HealthDetailEntry> getTodaysEntries(@Param("user") User u);

	@Query("SELECT * FROM HealthDetailEntry h WHERE h.createDate > date(date_sub(curdate(), interval 1 year)) AND h.user = :user AND type + :type")
	public abstract List<HealthDetailEntry> getLastYearEntriesByType(@Param("user") User u, @Param("type") HealthDetailType type);

	@Query("SELECT * FROM HealthDetailEntry h WHERE h.createDate > date(date_sub(curdate(), interval 1 month)) AND h.user = :user AND type + :type")
	public abstract List<HealthDetailEntry> getLastMonthEntriesByType(User currentUser, HealthDetailType detailType);
	
	public abstract List<HealthDetailEntry> findByUser(User u);
}
