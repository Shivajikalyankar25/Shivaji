package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question implements Questions_Demo{
	Connection connection=null;

	@Override
	public Connection getConnection() {
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "8600392895");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		return connection;
	}

	@Override
	public void SetConnection() {
		try {
			getConnection();
		PreparedStatement ps=connection.prepareStatement("insert into question(Questions)values(?)");
		ps.setString(1, "Binding of data in a single entity called...");
		ps.addBatch();
		int i=ps.executeUpdate();
		ps.setString(1, "what we achieve by using Inheritance");
		i=ps.executeUpdate();
		ps.addBatch();
		ps.setString(1, "which is the example of Dynamic dispatch ?");
		i=ps.executeUpdate();
		ps.addBatch();
		ps.setString(1, "Static member related to...");
		i=ps.executeUpdate();
		ps.addBatch();
		ps.setString(1, "which is not example of static binding?");
		i=ps.executeUpdate();
		ps.addBatch();
		ps.setString(1, "TO insert the object into stack which method is used ?");
		i=ps.executeUpdate();
		ps.setString(1, "Null insertion not allowed in...");
		 i=ps.executeUpdate();
		System.out.println("done.."+i);
		ps.close();
		connection.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String args[]) {
		Question q= new Question();
		q.SetConnection();
	}

}
