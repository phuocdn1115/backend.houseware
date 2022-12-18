package com.humanresourcemanagement.api.service;

import java.util.List;
import java.util.Optional;

import com.humanresourcemanagement.api.model.Department;
import com.humanresourcemanagement.api.model.Task;

public interface TaskService {
	List<Task> getAll();
	Task createTask(Task task);
	Task updateTask(Task task);
	void deleteTask(int idTask);
	List<Task> getTasksOfEmployee(int id);
	Optional<Task> getById(int id);

}
