package com.ty.pa.contorller;

import com.ty.pa.dto.Address;
import com.ty.pa.service.AddressService;

public class TestSaveAddress {

	public static void main(String[] args) {
		Address address = new Address() ;
		
		address.setAid(1);
		address.setStreet("basavanaudi"); 
		address.setDoorno(8); 
		address.setCity("bangalore"); 
		address.setPin(560019); 
		address.setPid(1); 

		AddressService addressService = new AddressService() ;

		int res = addressService.savePerson(address) ;

		if( res != 0 ) System.out.println("Data inserted");
		else System.out.println("No data inserted");


	}

}
