package Assinment5;

import java.util.Scanner;

public class LeapYear {
	public void leapY(int Year) {
		if ((Year%4)==0) {
			System.out.println("the Given Year is Leap Year");
		}else {
			System.out.println("The Given Year is not Leap Year");
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Year");
		int EnterYear=scanner.nextInt();
		LeapYear  leapyear =new LeapYear();
		leapyear.leapY(EnterYear);
		
	}

}
