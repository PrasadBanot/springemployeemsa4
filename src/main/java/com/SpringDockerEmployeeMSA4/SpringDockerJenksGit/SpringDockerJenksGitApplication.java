package com.SpringDockerEmployeeMSA4.SpringDockerJenksGit;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDockerJenksGitApplication implements CommandLineRunner {
	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerJenksGitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1= new Employee(20,"prasad",600000);
		Employee e2= new Employee(21,"vamshi",700000);
		Employee e3= new Employee(22,"pranay",660000);
		Employee e4= new Employee(23,"yashwanth",680000);
		Employee e5= new Employee(24,"sushmitha",500000);
		Employee e6= new Employee(25,"praveen",4500000);
		Employee e7= new Employee(26,"mohan",690000);
		Employee e8= new Employee(27,"rajesh",700000);
		Employee e9= new Employee(28,"pavithra",640000);
		Employee e10= new Employee(29,"srujan",620000);
		
		empRepository.employee.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));
		

	
		
	}

}
