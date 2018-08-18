package com.jason.spring.springTest.data;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hotel {
	@Id
	private String id;
	
	private Integer age;
	
	public String firstName;	
	
	public Hotel(int age, String firstName) {
		this.age = age;
		this.firstName = firstName;
	}
}
