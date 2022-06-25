package Assinment5;

import java.util.Scanner;

public class PossitiveorNegative {
	public static void PossitiveNegative(int num) {
		if (num<=1) {
			System.out.println("Ther GIven Nummber is Negative");
		}else {
			System.out.println("the Given Number is Possitive");
		}
	}
	   public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter the Number");
		   int Number = scanner.nextInt();
		   PossitiveNegative(Number);
		   
		   
		
	}
	

}
