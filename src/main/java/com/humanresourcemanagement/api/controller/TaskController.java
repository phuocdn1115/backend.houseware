package com.humanresourcemanagement.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.humanresourcemanagement.api.model.Task;
import com.humanresourcemanagement.api.service.TaskService;

@RestController
@RequestMapping("/api/task")
public class TaskController {
	private TaskService service;

	public TaskController(TaskService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Task>> getAllTasksOfEmployee(@RequestParam("idEmployee") int idEmployee){
		return new ResponseEntity<List<Task>>(service.getTasksOfEmployee(idEmployee), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Task> createTask(@RequestBody Task task) {
		return new ResponseEntity<Task>(service.createTask(task), HttpStatus.CREATED);
	}
	
	@PostMapping("/update")
	public ResponseEntity<Task> updateTask(@RequestBody Task task) {
		return new ResponseEntity<Task>(service.updateTask(task), HttpStatus.OK);
	}
	
	@GetMapping("/delete")
	public ResponseEntity<Boolean> deleteTask(@RequestParam("idTask") int idTask ){
		service.deleteTask(idTask);
		Optional<Task> task = service.getById(idTask);
		boolean result = !task.isPresent();
		return new ResponseEntity<Boolean>(result, HttpStatus.OK);
	}
}
