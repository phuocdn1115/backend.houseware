package com.humanresourcemanagement.api.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanresourcemanagement.api.model.Employee;
import com.humanresourcemanagement.api.repository.EmployeeRepository;
import com.humanresourcemanagement.api.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository repository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Optional<Employee> checkLogin(String username, String password) {
		return repository.checkLogin(username, password);
	}

	@Override
	public List<Employee> getAll() {
		return repository.findAll();
	}

}
