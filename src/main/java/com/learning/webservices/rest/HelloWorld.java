package com.learning.webservices.rest;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learning.webservices.rest.model.Person;

@Path("/messages")
public class HelloWorld {
@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Person> getMessage() {
		
		Person p1 = new Person("Nikhil","Noida");
		Person p2 = new Person("Ashish","Pune");
		Person p3 = new Person("Shobhit","Arizona");
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
	
		return persons;
	}
	
	
	
}