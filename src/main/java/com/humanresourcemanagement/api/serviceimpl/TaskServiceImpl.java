package com.humanresourcemanagement.api.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanresourcemanagement.api.model.Task;
import com.humanresourcemanagement.api.repository.TaskRepository;
import com.humanresourcemanagement.api.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	private TaskRepository repos;
	
	@Autowired
	public TaskServiceImpl(TaskRepository repos) {
		super();
		this.repos = repos;
	}

	@Override
	public List<Task> getAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	@Override
	public Task createTask(Task task) {
		// TODO Auto-generated method stub
		return repos.save(task);
	}

	@Override
	public Task updateTask(Task task) {
		// TODO Auto-generated method stub
		return repos.save(task);
	}

	@Override
	public void deleteTask(int idTask) {
		repos.deleteById(idTask);
	}

	@Override
	public List<Task> getTasksOfEmployee(int id) {
		// TODO Auto-generated method stub
		return repos.getTasksOfEmployee(id);
	}

	@Override
	public Optional<Task> getById(int id) {
		// TODO Auto-generated method stub
		return repos.findById(id);
	}

}
