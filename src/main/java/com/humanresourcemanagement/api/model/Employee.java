package com.humanresourcemanagement.api.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name ="tblemployee")
public class Employee{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name ="dob")
	private String dob;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name ="address")
	private String address;
	
	@Column(name ="hometown")
	private String homeTown;
	
	@Column(name ="username")
	private String username;
	
	@Column(name ="password")
	private String password;
	
	@Column(name ="position")
	private String position;
	
	@Column(name ="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name ="department", nullable = false)
	private Department department;
	
	@JsonIgnore
	@OneToMany(mappedBy = "madeBy")
	private List<Task> createdTasks;
	
	@JsonIgnore
	@OneToMany(mappedBy = "assignTo")
	private List<Task> tasks;
	
	@JsonIgnore
	@OneToMany(mappedBy = "createdBy")
	private List<Notice> notices;
	
	
	public Employee() {
		super();
		this.createdTasks = new ArrayList<Task>();
		this.tasks = new ArrayList<Task>();
		this.notices = new ArrayList<Notice>();
	}

	public Employee(String name, String email, String dob, String tel, String gender, String address, String homeTown,
			String username, String password, String position, String description) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.tel = tel;
		this.gender = gender;
		this.address = address;
		this.homeTown = homeTown;
		this.username = username;
		this.password = password;
		this.position = position;
		this.description = description;
		this.createdTasks = new ArrayList<Task>();
		this.tasks = new ArrayList<Task>();
		this.notices = new ArrayList<Notice>();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Task> getCreatedTasks() {
		return createdTasks;
	}

	public void setCreatedTasks(List<Task> createdTasks) {
		this.createdTasks = createdTasks;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Notice> getNotices() {
		return notices;
	}

	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}
	
	
}




	