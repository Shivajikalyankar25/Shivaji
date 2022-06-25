package Assignment3;

public class getDetails {
	public String studentDeatils(String Name, String Designation) {
		return Name; 
	} 
	public static void main(String[] args) {
	
		getDetails NameofStudent =new getDetails();
	
			String s = NameofStudent.studentDeatils("Shivaji", "Police");
			System.out.println("Name of Student is >>>>>" +s);
		
	}

}
