package com.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student_Data {
	static String seat;
	static String fname;
	static String lname;
	static String pass;
	
	public static void getRegister() {
		Scanner sc =new Scanner(System.in);
		
		try {
			System.out.println("Welcome to Java Quiz");
			System.out.println("Enter 1 for Register and 2 for Login");
			int a=sc.nextInt();
			if(a==1) {
			System.out.println("Register:");
			System.out.println("Enter your seat number>>");
			seat=sc.next();
			System.out.println("Enter your first name>>");
			fname=sc.next();
			System.out.println("Enter your last name>>");
			lname=sc.next();
			System.out.println("Enter your password>>");
			pass=sc.next();
			System.out.println("Register successfully...");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/demo", "root", "8600392895");
			PreparedStatement st=connection.prepareStatement("insert into studentdetails(seat_no,firstname,"
					+ "lastname,passwords)values(?,?,?,?)");
			st.setString(1, seat);
			st.setString(2, fname);
			st.setString(3, lname);
			st.setString(4, pass);
			int i=st.executeUpdate();
			System.out.println("done...");
			}else if(a==2) {
				login();
			}else {
				System.out.println("invalid option");
			}
			
			
	}catch(Exception e) {
		System.out.println(e);
		}
	}
	public static void login() {
		try {
			String s1=null;
			String s2=null;
			Scanner sc =new Scanner(System.in);
			System.out.println("Login:");
			System.out.println("Enter your seat number>>");
			String seat1=sc.next();
			System.out.println("Enter your password>>");
			String pass1=sc.next();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/demo", "root", "8600392895");
			PreparedStatement ps=connection.prepareStatement("select seat_no,passwords from studentdetails");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				s1=rs.getString(1);
			// System.out.println( s1);
		  	  s2=rs.getString(2);
			
			if(seat1.equals(s1)) {
				if(s2.equals(pass1)) {
					System.out.println("Login successfully...");
					break;
				}
			else {
					System.out.println("invalid password");
					login();
				}
			}else {
				System.out.println("invalid seat number");
				login();
			}}
			sc.close();
			connection.close();
			rs.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		getRegister();
	}

}
