package Assignment4;

import java.util.Scanner;

public class Division {
	public int Div(int e, int f) {
		int g =e/f;
		return g;
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber = scanner.nextInt();
		Division division =new Division();
		int z = division.Div(firstNumber, secondNumber);
		System.out.println("Multiplication of Number is >>>>>>" + z);
		
	}

}
