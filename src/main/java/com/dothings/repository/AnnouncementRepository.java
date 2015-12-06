package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.activity.Announcement;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {

}
