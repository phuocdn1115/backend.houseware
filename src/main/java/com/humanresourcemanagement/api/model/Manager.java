package com.humanresourcemanagement.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="tblmanager")
public class Manager extends Employee{
	
	@Column(name ="descriptions")
	private String descriptions;

	public Manager() {
		super();
	}

	public Manager(String name, String email, long dob, String tel, String gender, String address, String homeTown,
			String username, String password) {
		super(name, email, dob, tel, gender, address, homeTown, username, password);
	}

	public Manager(String descriptions) {
		super();
		this.descriptions = descriptions;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	
	

}
