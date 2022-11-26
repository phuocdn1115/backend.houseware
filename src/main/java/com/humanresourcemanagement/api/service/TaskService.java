package com.humanresourcemanagement.api.service;

import java.util.List;
import java.util.Optional;

import com.humanresourcemanagement.api.model.Task;

public interface TaskService {
	List<Task> getAll();
	Optional<Task> createTask(Task task);
	Optional<Task> updateTask(Task task);
	Boolean deleteEmployee(Task task);
	List<Task> getTasksOfEmployee(int id);

}
