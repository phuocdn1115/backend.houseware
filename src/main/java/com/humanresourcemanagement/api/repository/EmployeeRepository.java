package com.humanresourcemanagement.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query("select e from Employee e where username = ?1 and password =?2")
	Optional<Employee> checkLogin(String username, String password);
	
	@Query("select e from Employee e where department = (select d from Department d where id = ?1)")
	List<Employee> getAllEmployeeByDepartment(int id);
	
	@Query("select e from Employee e where e.name like ?1")
	List<Employee> searchEmployeeByKey(String key);
	
}
