package com.humanresourcemanagement.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.humanresourcemanagement.api.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
	@Query("select t from Task t where t.assignTo.id = ?1")
	List<Task> getTasksOfEmployee(int id);
}
