package Assinment5;

import java.util.Scanner;

public class MaxNumber {
	public void max(int a, int b, int c) {
		if (a>b && a>c) {
			System.out.println(" A is Greter");
			} else if  (b>a && b>c) {
				 System.out.println("B is Greter"); 
			 } else {
				 System.out.println("c is Greter");
			 } 
			}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstnumber=scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondnumber=scanner.nextInt();
		System.out.println("Enter the Third Number");
		int thirdnumber=scanner.nextInt();
		MaxNumber maxnumbar=new MaxNumber();
		maxnumbar.max(firstnumber, secondnumber, thirdnumber);
		
		
	}
			
}


