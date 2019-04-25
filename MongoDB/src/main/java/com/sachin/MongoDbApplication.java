package com.sachin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sachin.model.Customer;
import com.sachin.repo.CustomerRepository;

@SpringBootApplication
public class MongoDbApplication implements CommandLineRunner  {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{

		repository.deleteAll();

		//save customers
		repository.save(new Customer("Sachin","K S"));
		repository.save(new Customer("Sudhan","K S"));

		System.out.println("Fetch all Customers");
		System.out.println("-------------------------------");

		for(Customer customer:repository.findAll()){
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Sachin'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Sachin"));

		System.out.println("Customers found with findByLastName('K S'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("K S")) {
			System.out.println(customer);
		}

	}

}
