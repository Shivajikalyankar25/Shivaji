package Assignment8;

import java.util.Scanner;

public class EmployeeInformation {
	// to get the input from user
	public void getUserInput() {
	Employee emplyee = new Employee();
	// Creating scanner class object for user input
	Scanner scanner = new Scanner(System.in);
	// Taking first name from user and stored into employee.firstName
	System.out.println("Enter the first name>>");
	emplyee.firstName = scanner.nextLine();
	// Taking last name from user and stored into employee.lastName
	System.out.println("Enter the last name>>");
	emplyee.lastName = scanner.nextLine();
	// Taking city name from user and stored into employee.city
	System.out.println("Enter the city>>");
	emplyee.city = scanner.nextLine();
	// Taking mobile number from user and stored into employee.mobileNumber
	System.out.println("Enter the Mobile number>>");
	emplyee.mobileNumber = scanner.nextLong();
	// Passing information to getStudentInformation method
	getStudentInformation(emplyee.firstName, emplyee.lastName, emplyee.city, emplyee.mobileNumber,
	Employee.country);
	}
	// Method used for get all student details
	public void getStudentInformation(String fNname, String lName, String city, long mobNum, String country) {
	// Printing the student details
	System.out.println("Student Information:");
	System.out.println("First Name: " + fNname);
	System.out.println("Last Name: " + lName);
	System.out.println("City: " + city);
	System.out.println("Mobile number: " + mobNum);
	System.out.println("Country: " + country);
	}
	public static void main(String[] args) {
	// Creating the object for EmployeeInformation class
	EmployeeInformation employeeInformation = new EmployeeInformation();
	System.out.println("Enter the number of student>>");
	Scanner input = new Scanner(System.in);
	int count = input.nextInt();
	for (int i = 1; i <= count; i++) {
	System.out.println("Enter the Student details>>");
	employeeInformation.getUserInput(); // calling method for taking input values from user
	}
	}
}


