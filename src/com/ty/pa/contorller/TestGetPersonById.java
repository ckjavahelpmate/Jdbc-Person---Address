package com.ty.pa.contorller;

import com.ty.pa.dto.Person;
import com.ty.pa.service.PersonService;

public class TestGetPersonById {

	public static void main(String[] args) {
		
		PersonService personService = new PersonService() ;
		
		Person person = personService.getPersonById(1) ;
		
		System.out.println(person);

	}

}
