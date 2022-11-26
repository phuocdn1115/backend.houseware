package com.humanresourcemanagement.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
}
