package com.dothings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long>{

}
