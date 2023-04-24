/* =========================
  * @Author : Er.Prasad B.Badwar.
  * 
  * @Date : 21/04/2023
  * 
  * @Description : Employee DTO class
  * ==========================
  * */
package com.hdfc.ems.dto;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties.Decryption;

import com.hdfc.ems.exception.EmpNotFound;
import com.hdfc.ems.util.AESEncrypt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDTO {
	
	private long employeeId;
	
	private String employeeName;
	
	private LocalDate dateOfBirth;
	
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

	public byte[] getDateOfBirth() throws EmpNotFound {
		return AESEncrypt.encrypt(dateOfBirth);
	
		 
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
	
}
