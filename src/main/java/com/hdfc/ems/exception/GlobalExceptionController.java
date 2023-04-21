/* =========================
  * @Author : Er.Prasad B.Badwar.
  * 
  * @Date : 05/04/2023
  * 
  * @Description : This class is created for handling Global Exceptions.
  * ==========================
  * */
package com.hdfc.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(EmpNotFound.class)
	public ResponseEntity<String> handleBookExp(EmpNotFound e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
}
