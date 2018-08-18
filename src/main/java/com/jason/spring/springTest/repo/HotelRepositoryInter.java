package com.jason.spring.springTest.repo;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.jason.spring.springTest.data.Hotel;

public interface HotelRepositoryInter extends MongoRepository<Hotel, String> {
	public Hotel getByAge(int age);
	public List<Hotel> findAll();
	public List<Hotel> findByFirstName(String firstname);
}
