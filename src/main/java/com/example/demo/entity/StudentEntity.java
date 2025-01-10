package com.example.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")
public class StudentEntity {
	@Id
	@Column(name="id")
	private int id;
	
	
	
	
	
	
	@Column(name="age")
	private int age;
	@Column(name="name")
	private String name;
	
	
	

}
