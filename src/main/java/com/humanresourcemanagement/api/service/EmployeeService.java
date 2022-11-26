package com.humanresourcemanagement.api.service;

import java.util.List;
import java.util.Optional;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.model.Employee;

public interface EmployeeService {
	Optional<Employee> checkLogin(String username, String password);
	List<Employee> getAll();
	List<Employee> getAllEmployeeByDepartment(int id);
	Employee createEmployee(Employee e);
	Employee updateEmployee(Employee e);
	void deleteEmployee(Employee e);
	List<Employee> searchEmployee(String key);
}
