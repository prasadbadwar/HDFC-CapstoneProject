package com.hdfc.ems.servicetest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.ems.dto.EmployeeDTO;
import com.hdfc.ems.exception.EmpNotFound;
import com.hdfc.ems.service.EmployeeServiceImpl;
import com.hdfc.ems.service.IEmployeeService;

@SpringBootTest
class EmployeeServiceImplTest {

	
	@Autowired
	IEmployeeService service;
	@Test
	void testGetEmployee() throws EmpNotFound,Exception {
		EmployeeDTO emp=service.getEmployee(101);
		assertNotNull(emp);
	}

}
