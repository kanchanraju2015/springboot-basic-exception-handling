package com.briz.exceptapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Employee
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
int age;
String city;

public Employee(int id, String name, int age, String city) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.city = city;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
