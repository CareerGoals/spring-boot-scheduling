package com.career.goals.spring.scheduler.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.career.goals.spring.scheduler.model.Deal;

public interface DealDao extends JpaRepository<Deal, Integer>{

}
