package com.jason.spring.springTest;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jason.spring.springTest.data.Hotel;
import com.jason.spring.springTest.repo.HotelRepositoryInter;

@SpringBootApplication	
public class App implements CommandLineRunner
{
	@Autowired
	private HotelRepositoryInter repository;
	
    public static void main( String[] args )	
    {
        SpringApplication.run(App.class, args);

    }    
    
	public void run(String... args) throws Exception {
    	repository.deleteAll();

		// save a couple of customers
		repository.save(new Hotel(20, "Smith"));
		repository.save(new Hotel(25, "Smith"));

		// fetch all customers
		System.out.println("Hotels found with findAll():");
		System.out.println("-------------------------------");
		for (Hotel customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Hotel customer : repository.findByFirstName("Smith")) {
			System.out.println(customer);
		}
			

	}
}
