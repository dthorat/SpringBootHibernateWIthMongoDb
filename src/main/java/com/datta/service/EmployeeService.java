package com.datta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datta.domain.Employee;
import com.datta.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	EmployeeRepository employeeRepository = new EmployeeRepository();
	
	public void saveEmployee(Employee emp){
		employeeRepository.saveEmployee(emp);
	}
	
	public List<Employee> getEmployee(){
		return employeeRepository.getEmployee();
	}
}
