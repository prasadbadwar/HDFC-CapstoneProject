/* =========================
 @Author : Er.Prasad B.Badwar.
 @Date : 21/04/2023
 @Description : IEmployeeService class holds methods of employee operations;
*===========================*/
package com.hdfc.ems.service;

import com.hdfc.ems.dto.EmployeeDTO;
import com.hdfc.ems.exception.EmpNotFound;

public interface IEmployeeService {

		public EmployeeDTO getEmployee(long id) throws EmpNotFound,Exception;
}
