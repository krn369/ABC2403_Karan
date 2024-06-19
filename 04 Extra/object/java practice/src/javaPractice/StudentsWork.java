package javaPractice;

public class StudentsWork {

	public static void main(String[] args) {
		
		Students.school = "Diamond School";
		Students s1 = new Students();
		s1.name = "Karan PARIYAR";
		s1.address = "Mulhouse, France";
		
		System.out.println(Students.school);
		System.out.println(s1.name);
		System.out.println(s1.address);

	}

}

class Students{
	
	String name;
	String address;
	static String school;
}