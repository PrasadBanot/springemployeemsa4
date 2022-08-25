package com.SpringDockerEmployeeMSA4.SpringDockerJenksGit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	
	@Autowired
	EmpRepository empRepository;
	public List<Employee> getAll(){
		return empRepository.getAll();
	}
	

	

	}

