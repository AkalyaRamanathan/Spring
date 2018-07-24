package com.capg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.spring.dao.EmployeeDao;
import com.capg.spring.dto.Employee;

@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee e) {
		employeeDao.addEmployee(e);

	}

	@Override
	public List<Employee> showEmployee() {

		return employeeDao.showEmployee();
	}

}
