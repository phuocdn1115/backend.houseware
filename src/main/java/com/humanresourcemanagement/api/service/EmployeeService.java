package com.humanresourcemanagement.api.service;

import java.util.List;
import java.util.Optional;

import com.humanresourcemanagement.api.model.Employee;

public interface EmployeeService {
	Optional<Employee> checkLogin(String username, String password);
	List<Employee> getAll();
}
