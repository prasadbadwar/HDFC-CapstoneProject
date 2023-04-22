package com.hdfc.ems.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.exception.EmpNotFound;
import com.hdfc.ems.service.IEmployeeService;

@RestController
@RequestMapping("/ems")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	private static final Logger log=Logger.getLogger(EmployeeRestController.class);

	@GetMapping("/findemployee/{id}")
	public Employee getEmployee(@PathVariable long id) throws EmpNotFound {
		log.info("Getmapping called");
		return service.getEmployee(id);
	}
}
