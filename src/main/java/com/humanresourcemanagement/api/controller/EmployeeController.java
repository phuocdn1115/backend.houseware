package com.humanresourcemanagement.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.model.Employee;
import com.humanresourcemanagement.api.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/checklogin/{username}/{password}")
	public ResponseEntity<Optional<Employee>> checkLogin(@PathVariable("username") String username, @PathVariable("password") String password){
		return new ResponseEntity<Optional<Employee>>(service.checkLogin(username, password),HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAll(){
		return new ResponseEntity<List<Employee>>(service.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("/getbydepartment/{iddepartment}")
	public ResponseEntity<List<Employee>> getAllEmployeeByDepartment(@PathVariable("iddepartment") int id){
		return new ResponseEntity<List<Employee>>(service.getAllEmployeeByDepartment(id), HttpStatus.OK);
	}


}
