package Assignment4;

import java.util.Scanner;

public class Multiplication {
	public int sub(int a, int b) {
		int c =a*b;
		return c;
		
	} public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the First Value");
		int firstvalue = scanner.nextInt();
		System.out.println("Enter the Second Value");
		int secondvalue = scanner.nextInt();
		Multiplication multiplication =new Multiplication();
		int z = multiplication.sub(firstvalue, secondvalue);
		System.out.println("Multiplication Value is  >>>> " + z);
		
	}

}
