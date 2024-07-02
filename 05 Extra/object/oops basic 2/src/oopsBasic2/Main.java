package oopsBasic2;

public class Main {

	public static void main(String[] args) {
		
		// creating object of student
		
		Student st1;
		st1 = new Student();
		
		st1.studentName = "KARAN";
		st1.studentCity = "PARIS";
		st1.studentId = 123456;
		
		st1.study();
		st1.showFullDetails();
		
		Student st2;
		st2 = new Student(741, "ROJITA", "KATHMANDU");
		
			
		st2.study();
		st2.showFullDetails();
		
		
		Dog d1 = new Dog();
		d1.eating();
		System.out.println(d1.color);
		
		
	}

}
