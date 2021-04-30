package com.example.demo.service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;
import com.example.demo.repo.SubTaskRepo;
import com.example.demo.repo.TaskRepo;


@Service
public class TaskService {
	private TaskRepo taskRepo;
	private SubTaskRepo subTaskRepo;
	public TaskService(TaskRepo taskRepo, SubTaskRepo subTaskRepo) {
		super();
		this.taskRepo = taskRepo;
		this.subTaskRepo = subTaskRepo;
	}
	public ResponseEntity<Object> saveOrUpdateTask(Task task)
	{
		Task newTask=new Task();
		newTask.setOwnerName(task.getOwnerName());
		newTask.setStartDate(task.getStartDate());
		newTask.setEndDate(task.getEndDate());
		newTask.setSubtask(task.getSubtask());
		Task saveTask=taskRepo.save(newTask);
		if(taskRepo.findById(saveTask.getId()).isPresent()) {
			 return ResponseEntity.accepted().body("Successfully Created Task and subtask");
		
		        } else
	
		            return ResponseEntity.unprocessableEntity().body("Failed to Create specified Task");
	}
	 public ResponseEntity<Object> deleteTask(Integer id) {
         if (taskRepo.findById(id).isPresent()) {
       	  taskRepo.deleteById(id);
 
             if (taskRepo.findById(id).isPresent()) {
 
                 return ResponseEntity.unprocessableEntity().body("Failed to delete the specified record");
 
             } else return ResponseEntity.ok().body("Successfully deleted specified record");
 
         } else
 
             return ResponseEntity.unprocessableEntity().body("No Records Found");
 
     }

}
