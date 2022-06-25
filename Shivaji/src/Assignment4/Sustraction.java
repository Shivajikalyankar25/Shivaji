package Assignment4;

import java.util.Scanner;

public class Sustraction {
	public int sub(int x, int y){
		int z =x-y;
		return z;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the FIrst Number");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber = scanner.nextInt();
		Sustraction substractio =new Sustraction();
		int s = substractio.sub(firstNumber, secondNumber);
		System.out.println("The Value is >>>>>>" + s);
		
		
	}
	

}
