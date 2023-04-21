/* =========================
 @Author : Er.Prasad B.Badwar.
 @Date : 21/04/2023
 @Description : EmployeeServiceImpl class is implementation class for methods of IEmployeeService interface.
*===========================*/
package com.hdfc.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository emprepo;
	
	@Override
	public Employee getEmployee(long id) {
		
		return emprepo.findById(id).orElse(null);
	}

}
