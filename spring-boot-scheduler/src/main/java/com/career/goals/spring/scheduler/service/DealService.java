package com.career.goals.spring.scheduler.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.career.goals.spring.scheduler.DAO.DealDao;
import com.career.goals.spring.scheduler.model.Deal;

@Service
public class DealService {

	@Autowired
	private DealDao dao;

	// schedule a job to add object in DB (In every 5 sec)
	@Scheduled(fixedRate = 5000)
	public void setDataInDb() {
		Deal user = new Deal();
		user.setName("user " + new Random().nextInt(78787878));
		dao.save(user);
		System.out.println("add service call in " + new Date().toString());

	}
	
	@Scheduled(cron="0/30 * * * * *")
	public void fetchJob() {
		List<Deal> user=dao.findAll();
		System.out.println("fetch service call in " + new Date().toString());
		System.out.println("no of records fetched " + user.toString());
	}

}
