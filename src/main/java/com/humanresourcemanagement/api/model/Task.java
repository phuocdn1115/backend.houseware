package com.humanresourcemanagement.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbltask")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "createdTime")
	private long createdTime;
	
	@Column(name = "estimate")
	private long estimate;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "details")
	private String details;
	
	@Column(name ="status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "madeBy", nullable = false)
	private Employee madeBy;
	
	@ManyToOne
	@JoinColumn(name = "assignTo", nullable = true)
	private Employee assignTo;

	public Task() {
		super();
	}

	public Task(long createdTime, long estimate, String title, String details, String status, Employee madeBy,
			Employee assignTo) {
		super();
		this.createdTime = createdTime;
		this.estimate = estimate;
		this.title = title;
		this.details = details;
		this.status = status;
		this.madeBy = madeBy;
		this.assignTo = assignTo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public long getEstimate() {
		return estimate;
	}

	public void setEstimate(long estimate) {
		this.estimate = estimate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(Employee madeBy) {
		this.madeBy = madeBy;
	}

	public Employee getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(Employee assignTo) {
		this.assignTo = assignTo;
	}
	
	

}
