package com.capg.spring.dao;

import java.util.List;

import com.capg.spring.dto.Employee;

public interface EmployeeDao {

	
	public void addEmployee(Employee e);
	public List<Employee> showEmployee();
}
