package com.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;

public class Random_Question {
	static String s;static int count;
	public static  void getresult(String s) {
		
		try {
			String sql="select answer_op from answers";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/demo", "root", "8600392895");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				
				String sr=rs.getString(1);
				
				if(sr.equals(s)) {
					count++;
					
				}
			}System.out.println(count);
			getCount();
			connection.close();
			st.close();
			rs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		}
	public static void getCount() {
		try {
	
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/demo", "root", "8600392895");
			PreparedStatement st=connection.prepareStatement("insert into studentdetails(result)values(?)");
			
			st.setInt(1, count);
			int i =st.executeUpdate();
			System.out.println("done..");
			connection.close();
			 st.close();
			 
			}catch(Exception e) {
				System.out.println(e);
			}
	
		}
		
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		
			try {
				String sql="Select * from queoptions";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/demo", "root", "8600392895");
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(sql);
		
			while (rs.next()) {
				System.out.println(rs.getString(2));
				System.out.println("a."+rs.getString(3));
				System.out.println("b."+rs.getString(4));
				System.out.println("c."+rs.getString(5));
				System.out.println("d."+rs.getString(6));
				
				System.out.println("ans>>");
				s=sc.next();
				getresult(s);
			}
				
		connection.close();
		st.close();
		rs.close();
			}catch(Exception e) {
			System.out.println(e);
		}
		
	
		
		/*register
		name
		password
		id..db .....result set rs>>al1
		login
		id
		password..... al=id,passowrd al.equals(al1)
		
		*/
	}

}
