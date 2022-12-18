package com.humanresourcemanagement.api.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.model.Employee;
import com.humanresourcemanagement.api.model.Task;
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
	public Employee checkLogin(String username, String password) {
		Employee e = repository.checkLogin(username, password);
		if(e== null){
			e = new Employee();
		}
		return e;
	}

	@Override
	public List<Employee> getAll() {
		return repository.findAll();
	}

	@Override
	public List<Employee> getAllEmployeeByDepartment(int id) {
		return repository.getAllEmployeeByDepartment(id) ;
	}

	@Override
	public Employee createEmployee(Employee e) {
		return repository.save(e);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return repository.save(e);
	}

	@Override
	public List<Employee> searchEmployee(String key) {
		return repository.searchEmployeeByKey(key);
	}

	@Override
	public void deleteEmployee(Employee e) {
		repository.delete(e);
	}

	@Override
	public List<Task> getAllTaskOfEmployee(int idEmployee) {
		return repository.getAllTaskOfEmployee(idEmployee);
	}

	@Override
	public List<Task> getAllTaskMade(int idEmployee) {
		// TODO Auto-generated method stub
		return repository.getAllTaskMadeByEmployee(idEmployee);
	}

	@Override
	public List<Task> getAllTaskDone(int idEmployee) {
		// TODO Auto-generated method stub
		return repository.getAllTaskDone("DONE", idEmployee);
	}

}
