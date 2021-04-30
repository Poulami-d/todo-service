package com.example.demo.entity;
import javax.persistence.*;

import java.util.List;
@Entity

@Table(name = "task")
public class Task {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="id")    
	 private Integer id;
	@Column(name="owner_name")
	  private String ownerName;
	@Column(name="start_date")
	private String startDate;
	@Column(name="end_date")
	private String endDate;
	 @OneToMany(targetEntity = SubTask.class)
	     private List<SubTask> subtask;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public List<SubTask> getSubtask() {
		return subtask;
	}
	public void setSubtask(List<SubTask> subtask) {
		this.subtask = subtask;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	 

}
