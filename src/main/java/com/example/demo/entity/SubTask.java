package com.example.demo.entity;

import javax.persistence.*;

@Entity

@Table(name = "subtask")
public class SubTask {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="id")    
	 private Integer id;
	 @Column(name="subtask_name")
	 private String subtaskName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubtaskName() {
		return subtaskName;
	}
	public void setSubtaskName(String subtaskName) {
		this.subtaskName = subtaskName;
	}
	 
}
