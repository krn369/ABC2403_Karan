package javaPractice;

public class InheritenceWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.name = "Karan";
		s1.age = 25;
		s1.rollno = 111;
		
		s1.printInfo();
		s1.printStudentInfo();
		
		Person p1 = new Person();
		p1.name = "Pariyar";
		p1.age = 62;
		
		p1.printInfo();
		
	}

}

class Person {
	// properties
	String name;
	int age;
	
	
	// METHODS 
	
	void printInfo() {
		
		System.out.println("The name is : " + name);
		System.out.println("The age is :" + age);
	}
}

class Student extends Person{
	
	int rollno;
	
	void printStudentInfo() {
		
		System.out.println("The roll number is :"  + rollno);
	}
}