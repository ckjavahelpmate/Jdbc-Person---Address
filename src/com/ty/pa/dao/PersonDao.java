package com.ty.pa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.pa.dto.Person;
import com.ty.pa.util.ConnectionObject;

public class PersonDao {

	public int savePerson(Person person) {

		Connection connection = ConnectionObject.getConnection() ;

		String sql = "insert into person values(?,?,?,?)" ;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql) ;

			preparedStatement.setInt(1, person.getPid());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3, person.getEmail());
			preparedStatement.setString(4, person.getPhone());

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

	public Person getPersonById(int id) {
		Connection connection = ConnectionObject.getConnection() ;
		Person person = new Person() ;
		String sql = "select * from person where pid=?" ;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql) ;
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				person.setPid(resultSet.getInt(1));
				person.setName(resultSet.getString(2)); 
				person.setEmail(resultSet.getString(3)); 
				person.setPhone(resultSet.getString(4)); 
				
			}
			
			return person;

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
