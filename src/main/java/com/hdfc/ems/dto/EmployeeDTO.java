/* =========================
  * @Author : Er.Prasad B.Badwar.
  * 
  * @Date : 21/04/2023
  * 
  * @Description : Employee DTO class
  * ==========================
  * */
package com.hdfc.ems.dto;

import com.hdfc.ems.exception.EmployeeNotFound;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDTO {
	
	private long employeeId;
	
	private String employeeName;
	
	private byte[] dateOfBirth;
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public byte[] getDateOfBirth() throws EmployeeNotFound {
		return dateOfBirth;
	
		 
	}

	public void setDateOfBirth(byte[] dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
	
}
