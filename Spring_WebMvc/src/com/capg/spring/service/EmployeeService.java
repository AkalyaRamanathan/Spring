package com.capg.spring.service;

import java.util.List;

import com.capg.spring.dto.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee e);
	public List<Employee> showEmployee();
}