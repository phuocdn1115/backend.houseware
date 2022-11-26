package com.humanresourcemanagement.api.service;

import java.util.List;
import java.util.Optional;

import com.humanresourcemanagement.api.model.Department;

public interface DepartmentService {
	List<Department> getAll();
	Department createDepartment(Department department);
	Department updateDepartment(Department department);
	void deleteEmployee(int id);
	
	
}
