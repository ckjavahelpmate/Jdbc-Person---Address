package com.ty.pa.service;

import com.ty.pa.dao.AddressDao;
import com.ty.pa.dto.Address;

public class AddressService {

	AddressDao dao = new AddressDao() ;
	
	public int savePerson(Address address) {
		
		return dao.saveaddress(address) ;
	}
	
	public Address getPersonByAid(int id) {
		Address address = dao.getaddressByAid(id) ;
		return address ; 
	}
	
	
	
}
