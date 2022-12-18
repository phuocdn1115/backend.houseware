package com.humanresourcemanagement.api.service;

import java.util.List;
import java.util.Optional;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.model.Employee;
import com.humanresourcemanagement.api.model.Task;

public interface EmployeeService {
	Employee checkLogin(String username, String password);
	List<Employee> getAll();
	List<Employee> getAllEmployeeByDepartment(int id);
	Employee createEmployee(Employee e);
	Employee updateEmployee(Employee e);
	void deleteEmployee(Employee e);
	List<Employee> searchEmployee(String key);
	List<Task> getAllTaskOfEmployee(int idEmployee);
	List<Task> getAllTaskMade(int idEmployee);
	List<Task> getAllTaskDone(int idEmployee);
}
