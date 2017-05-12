package com.datta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datta.domain.Employee;
import com.datta.service.EmployeeService;

@RequestMapping("/emp-mgmt")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee emp){
		employeeService.saveEmployee(emp);
	}

	@RequestMapping(value="/",method=RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployee(){
		List<Employee> empList = employeeService.getEmployee();
		return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	}
}
