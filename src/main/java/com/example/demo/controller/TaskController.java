package com.example.demo.controller;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

@RestController
public class TaskController {
	private TaskService taskService;

	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}
	  @PostMapping("/create/tasks")
	  
	      public ResponseEntity<Object> createTask(@RequestBody Task task) {
	  
	          return  taskService.saveOrUpdateTask(task);
	  
	      }
	  @DeleteMapping("/role/delete/{id}")
	  
	      public ResponseEntity<Object> deleteTask(@PathVariable Integer id) {
	  
	          return taskService.deleteTask(id);
	  
	      }
		  
		  
}
