package Assignment4;

import java.util.Scanner;

public class StudentResult {
		public static String  StudentName(String NameofStudent) {
		return NameofStudent;
	}
		public static void  studentmarks(int Marathi, int English, int Mathametics, int Science, int Social) {
		int total = Marathi+English+Mathametics+Science+Social;
		System.out.println("Total Marks are " + total);
		float Percentage = (total/125f)*100;
		System.out.println("Percentage of all subjects are " + Percentage);
			if (Percentage<=40) {
			System.out.println("FAIL");
			
			}else {
			
			System.out.println("Pass");
			}
		
		}
		public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Name of Student ");
		String Name=scanner.next();
		//StudentResult studentResult=new StudentResult();
		String z =StudentName(Name);
		System.out.println("Name of the Student is >>>" +z);
		System.out.println("Enter Marathi Subject Marks>> ");
		int marathi=scanner.nextInt();
		System.out.println("Enter English Subject Marks>> ");
		int english=scanner.nextInt();
		System.out.println("Enter Mathamatics Subject Marks>> ");
		int mathamatics =scanner.nextInt();
		System.out.println("Enter Science Subject Marks>> ");
		int science=scanner.nextInt();
		System.out.println("Enter Social Subject Marks>> ");
		int social=scanner.nextInt();
		StudentResult.studentmarks(marathi, english, mathamatics, science, social);
	
	}

}
