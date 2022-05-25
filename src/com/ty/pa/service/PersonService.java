package com.ty.pa.service;

import com.ty.pa.dao.PersonDao;
import com.ty.pa.dto.Person;

public class PersonService {

	PersonDao dao = new PersonDao() ;
	
	public int savePerson(Person person) {
		
		return dao.savePerson(person);
	}
	
	public Person getPersonById(int id) {
		Person person = dao.getPersonById(id) ;
		return person ; 
	}
	
	
	
}
