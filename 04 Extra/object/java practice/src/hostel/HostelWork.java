package hostel;

public class HostelWork {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Karan";
		s1.address = "Mulhouse, France";
		
		System.out.println(s1.name);
		System.out.println(s1.address);
		
	}

}

class Student{
	
	String name;
	String address;
	
}