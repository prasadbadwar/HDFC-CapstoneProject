/* =========================
  * @Author : Er.Prasad B.Badwar.
  * @Date : 22/04/2023
  * @Description : EmployeeRestController
  * ==========================
  * */
package com.hdfc.ems.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.ems.dto.EmployeeDTO;
import com.hdfc.ems.service.IEmployeeService;

@RestController
@RequestMapping("/hdfc/ems")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	private static final Logger log=Logger.getLogger(EmployeeRestController.class);

	@GetMapping("/findemployee/{id}")
	public EmployeeDTO getEmployee(@PathVariable long id) throws Exception {
		log.info("Getmapping called");
		return service.getEmployee(id);
	}
}
