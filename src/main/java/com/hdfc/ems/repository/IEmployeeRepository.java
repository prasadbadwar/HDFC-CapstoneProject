/* =========================
  * @Author : Er.Prasad B.Badwar.
  * 
  * @Date : 21/04/2023
  * 
  * @Description : IEmployeeRepository is an interface which extends JpaRepository for connecting with Employee table of employeedb database.
  * ==========================
  * */
package com.hdfc.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.ems.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
