package com.humanresourcemanagement.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	private DepartmentService service;

	public DepartmentController(DepartmentService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
		return new ResponseEntity<Department>(service.createDepartment(department), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Department>> getAll(){
		return new ResponseEntity<List<Department>>(service.getAll(), HttpStatus.OK);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Department> updateDepartment(@RequestBody Department department) {
		return new ResponseEntity<Department>(service.updateDepartment(department), HttpStatus.OK);
	}
	
	@GetMapping("/delete")
	public ResponseEntity<Boolean> deleteDepartment(@RequestParam("iddepartment") int iddepartment ){
		service.deleteEmployee(iddepartment);
		Optional<Department> de = service.getById(iddepartment);
		boolean result = !de.isPresent();
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}
}
