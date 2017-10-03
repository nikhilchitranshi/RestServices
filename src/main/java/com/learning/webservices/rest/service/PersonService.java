package com.learning.webservices.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.learning.webservices.rest.dao.DatabaseClass;
import com.learning.webservices.rest.model.Person;

public class PersonService {
	
	private HashMap<Integer,Person> persons = DatabaseClass.persons;
	
	public PersonService() {
		persons.put(1, new Person("Akrati","Agra"));
		persons.put(1, new Person("Chandu","Banglore"));
	}
	
	
	public void addPerson(Person person) {
		persons.put(persons.size()+1, person);
	}
	
	public List<Person> getPersons() {
		return new ArrayList<Person>(persons.values());
	}
	

}
