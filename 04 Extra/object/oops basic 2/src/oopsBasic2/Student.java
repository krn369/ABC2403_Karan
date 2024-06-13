package oopsBasic2;

public class Student {
	
	// data : data members : instance variable
	int studentId;
	String studentName;
	String studentCity;
	
	public Student() {
		this(96, "HONGKONG", "TOKYO");
		System.out.println("Creating objects : non parameterized.");
		
	}
	
	

	
	  public Student(int st) {
	  System.out.println("Parameterized constructor : (int)"); }
	 
	 
	public Student(int id, String studentName, String studentCity) {
		studentId = id;
		this.studentName = studentName ;
		this.studentCity = studentCity;
		System.out.println("Parameterized constructor : (int)");
	}
	
	
	// Behaviour : member methods : methods : functions
	
	public void study() {
		
		System.out.println(studentName + " is studying.");
		System.out.println(this.studentCity);
	}
	
	
		
	public void showFullDetails() {
		
		System.out.println("My name is " + studentName);
		System.out.println("My id is " + studentId);
		System.out.println("My city is " + studentCity);
		
	}
	
}
