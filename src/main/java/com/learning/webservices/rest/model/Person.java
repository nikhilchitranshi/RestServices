package com.learning.webservices.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	
	int id;
	String name;
	String city;
	
	public Person() {}
	
	public Person(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
