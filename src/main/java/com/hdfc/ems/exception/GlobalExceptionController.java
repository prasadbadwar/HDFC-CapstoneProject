/* =========================
 @Author : Er.Prasad B.Badwar.
 @Date : 21/04/2023
 @Description : This class is created for handling Global Exceptions.
*===========================*/
package com.hdfc.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> handleEmployeeExp(EmployeeNotFound e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleInputExp(MethodArgumentTypeMismatchException e){
		return new ResponseEntity<>("Input value should be numbered...",HttpStatus.BAD_REQUEST);
	}
	
}
