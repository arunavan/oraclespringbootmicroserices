package com.infosys.infytel.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {
	
	List<Plan> findAll();

}
