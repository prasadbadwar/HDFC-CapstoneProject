/* =========================
 @Author : Er.Prasad B.Badwar.
 @Date : 21/04/2023
 @Description : EmployeeServiceImpl class is implementation class for methods of IEmployeeService interface.
*===========================*/
package com.hdfc.ems.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.ems.entity.Employee;
import com.hdfc.ems.exception.EmpNotFound;
import com.hdfc.ems.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository emprepo;
	
	private static final Logger log=Logger.getLogger(EmployeeServiceImpl.class);
	
	@Override
	public Employee getEmployee(long id) throws EmpNotFound {
		if(!emprepo.existsById(id)) {
			log.error("Invalid EmployeeID");
			throw new EmpNotFound(" Invalid EmployeeID");
		}
		log.info("Employee Details Shown successfully!");
		return emprepo.findById(id).orElse(null);
	}

}
