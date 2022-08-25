package com.SpringDockerEmployeeMSA4.SpringDockerJenksGit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	
	@RestController
	@RequestMapping("/emp")
	public class EmployeeController {
		
		@Autowired
		EmployeeService employeeService;
		@GetMapping("/get/all")
		public List<Employee> getAll(){
			return employeeService.getAll();
			
		}
	
		

	}
