package com.ty.pa.contorller;

import com.ty.pa.dto.Person;
import com.ty.pa.service.PersonService;

public class TestSavePerson {

	public static void main(String[] args) {
		Person person = new Person() ;
		person.setPid(1);
		person.setName("Sheela") ;
		person.setEmail("She@mail.com") ;
		person.setPhone("8989556665") ;
		
		PersonService personService = new PersonService() ;
		
		int res = personService.savePerson(person) ;
		
		if( res != 0 ) System.out.println("Data inserted");
		else System.out.println("No data inserted");
			
		
	}

}
