package Assignment4;

import java.util.Scanner;

public class Addition {
	public int add (int a , int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstNumber= scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber=scanner.nextInt();
		Addition addition = new Addition();
		int d = addition.add(firstNumber, secondNumber);
		System.out.println("Addition of Two Number>>" + d);
	}

}
