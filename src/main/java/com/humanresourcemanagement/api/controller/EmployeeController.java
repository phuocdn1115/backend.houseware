package com.humanresourcemanagement.api.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.model.Employee;
import com.humanresourcemanagement.api.model.Task;
import com.humanresourcemanagement.api.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	private EmployeeService service;

	public EmployeeController(EmployeeService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e){
		return new ResponseEntity<Employee>(service.createEmployee(e), HttpStatus.CREATED);
	}
	
	@GetMapping("/checklogin")
	public ResponseEntity<Employee> checkLogin(@RequestParam("username") String username, @RequestParam("password") String password){
		return new ResponseEntity<Employee>(service.checkLogin(username, password),HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAll(){
		return new ResponseEntity<List<Employee>>(service.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("/getbydepartment")
	public ResponseEntity<List<Employee>> getAllEmployeeByDepartment(@RequestParam("iddepartment") int id){
		return new ResponseEntity<List<Employee>>(service.getAllEmployeeByDepartment(id), HttpStatus.OK);
	}
	
	@GetMapping("/searchByKey")
	public ResponseEntity<List<Employee>> searchByKey(@RequestParam("key") String key){
		return new ResponseEntity<List<Employee>>(service.searchEmployee(key), HttpStatus.OK);
	}
	
	@GetMapping("/getAllTaskOfEmployee")
	public ResponseEntity<List<Task>> getAllTaskOfEmployee(@RequestParam("idEmployee")int id){
		return new ResponseEntity<List<Task>>(service.getAllTaskOfEmployee(id), HttpStatus.OK);
	}
	
	@GetMapping("/getAllTaskMadeByEmployee")
	public ResponseEntity<List<Task>> getAllTaskMadeByEmployee(@RequestParam("idEmployee")int id){
		return new ResponseEntity<List<Task>>(service.getAllTaskMade(id), HttpStatus.OK);
	}
	
	@GetMapping("/getAllTaskDoneOfEmployee")
	public ResponseEntity<List<Task>> getAllTaskDoneOfEmployee(@RequestParam("idEmployee")int id){
		return new ResponseEntity<List<Task>>(service.getAllTaskDone(id), HttpStatus.OK);
	}

}
