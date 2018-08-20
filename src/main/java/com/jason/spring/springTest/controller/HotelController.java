package com.jason.spring.springTest.controller;

import java.awt.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jason.spring.springTest.data.Hotel;
import com.jason.spring.springTest.repo.HotelRepositoryInter;

@RestController
public class HotelController {
	
	@Autowired
	private HotelRepositoryInter repository;
	
	@RequestMapping("/hotel")
	public Hotel getByAge() {
		return repository.findByFirstName("Smith").get(0);
	}
}
