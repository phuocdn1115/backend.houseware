package com.humanresourcemanagement.api.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.repository.DepartmentRepository;
import com.humanresourcemanagement.api.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	private DepartmentRepository repos;
	
	@Autowired
	public DepartmentServiceImpl(DepartmentRepository repos) {
		super();
		this.repos = repos;
	}

	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	@Override
	public Department createDepartment(Department department) {
		// TODO Auto-generated method stub
		return repos.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return repos.save(department);
	}

	@Override
	public void deleteEmployee(int id) {
		repos.deleteById(id);;
	}

	@Override
	public Optional<Department> getById(int id) {
		// TODO Auto-generated method stub
		return repos.findById(id);
	}
	


}
