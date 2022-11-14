package com.humanresourcemanagement.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="tblemployee")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name ="dob")
	private long dob;
	
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
	
	
	
	public Employee() {
		super();
	}
	public Employee(String name, String email,long dob, String tel, String gender, String address, String homeTown, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.tel = tel;
		this.gender = gender;
		this.address = address;
		this.homeTown = homeTown;
		this.username = username;
		this.password = password;
		this.dob = dob;
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
	public long getDob() {
		return dob;
	}
	public void setDob(long dob) {
		this.dob = dob;
	}
	
	
}




	