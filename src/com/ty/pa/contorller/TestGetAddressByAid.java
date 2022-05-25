package com.ty.pa.contorller;

import com.ty.pa.dto.Address;
import com.ty.pa.service.AddressService;

public class TestGetAddressByAid {

	public static void main(String[] args) {

		AddressService  addressService = new AddressService() ;
		
		Address address = addressService.getPersonByAid(1) ;
		
		System.out.println(address);
		
		
	}

}
