package com.capg.spring.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capg.spring.dto.Employee;
import com.capg.spring.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empolyeeService;
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllEmployees() {
		List<Employee> list=empolyeeService.showEmployee();
		return new ModelAndView("show","emps",list);
		
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String myEmployee(@ModelAttribute("emp") Employee emp)
	{
		return "add_employee";
	}
	@RequestMapping(value="/addemployee",method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute("emp") Employee emp,BindingResult result) {
		empolyeeService.addEmployee(emp);
		return "redirect:/showall";
		
	}
}
