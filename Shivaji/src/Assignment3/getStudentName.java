/*Design a Method a Programe getstudentName */
 
package Assignment3;

public class getStudentName {
	public String getStudentname(String Name, String LastName) {
		String str = Name + " " + LastName;
		return str;
	}
	public static void main(String[] args) {
		
		getStudentName getName =new getStudentName();
		String s = getName.getStudentname("Shivaji", "Kalyankar");		
		System.out.println("Student Name is >>>" + s);
				
	}
	

}
