package com.hdfc.ems.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
	@Id
	@NotNull
	@Column(name="employee_id")
	private long employeeId;
	
	@NotEmpty
	@Column(name = " employee_name")
	private String employeeName;
	
	@NotEmpty
	@Column(name = " date_of_birth")
	private LocalDate dateOfBirth;
}
