package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Options extends Question{
	
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
			PreparedStatement ps=connection.prepareStatement("insert"
					+ " into que_options(option_A,option_B,option_C,option_D)values(?,?,?,?)");
			ps.setString(1,"add()");
			ps.setString(2,"put()");
			ps.setString(3,"push()");
			ps.setString(4,"peak()");
			int i=ps.executeUpdate();
			System.out.println("done..."+i);
			}catch(Exception e) {
				System.out.println(e);
				}
			}
	public static void main(String args[]) {
		Options O=new Options();
		O.SetConnection();
	}

}
