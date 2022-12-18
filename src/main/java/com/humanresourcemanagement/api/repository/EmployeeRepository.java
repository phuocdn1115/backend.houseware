package com.humanresourcemanagement.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.model.Employee;
import com.humanresourcemanagement.api.model.Task;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query("select e from Employee e where username = ?1 and password =?2")
	Employee checkLogin(String username, String password);
	
	@Query("select e from Employee e where e.department.id = ?1")
	List<Employee> getAllEmployeeByDepartment(int id);
	
	@Query("select e from Employee e where e.name like ?1")
	List<Employee> searchEmployeeByKey(String key);
	
	@Query("select t from Task t where t.assignTo.id = ?1")
	List<Task> getAllTaskOfEmployee(int id);
	
	@Query("select t from Task t where t.madeBy.id = ?1")
	List<Task> getAllTaskMadeByEmployee(int id);
	
	@Query("select t from Task t where t.status = ?1 and t.assignTo.id = ?2")
	List<Task> getAllTaskDone(String status, int idEmployee);
}
