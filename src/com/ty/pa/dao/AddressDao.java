package com.ty.pa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.pa.dto.Address;
import com.ty.pa.util.ConnectionObject;

public class AddressDao {

	public int saveaddress(Address address) {

		Connection connection = ConnectionObject.getConnection() ;

		String sql = "insert into address values(?,?,?,?,?,?)" ;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql) ;

			preparedStatement.setInt(1, address.getAid());
			preparedStatement.setString(2, address.getStreet());
			preparedStatement.setInt(3, address.getDoorno());
			preparedStatement.setString(4, address.getCity());
			preparedStatement.setInt(5, address.getPin());
			preparedStatement.setInt(6, address.getPid());

			return preparedStatement.executeUpdate() ;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


		return 0;
	}

	public Address getaddressByAid(int id) {
		Connection connection = ConnectionObject.getConnection() ;
		Address address = new Address() ;
		String sql = "select * from address where Aid=?" ;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql) ;
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				address.setPid(resultSet.getInt(1));
				address.setStreet(resultSet.getString(2)); 
				address.setDoorno(resultSet.getInt(3)); 
				address.setCity(resultSet.getString(4)); 
				address.setPin(resultSet.getInt(5)); 
				address.setPid(resultSet.getInt(6)); 
				
			}
			
			return address;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null ;

	}

}
