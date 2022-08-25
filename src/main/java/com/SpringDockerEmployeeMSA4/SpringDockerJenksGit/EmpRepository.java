package com.SpringDockerEmployeeMSA4.SpringDockerJenksGit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class EmpRepository {
	public List<Employee> employee =new ArrayList<Employee>();

	public List<Employee> getAll() {
		
		return employee;
	}
	

}
