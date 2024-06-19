package javaPractice;

enum Gender{Male, Female, Other}

public class EnumWork {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.gender = Gender.Male;
		h1.name = "Karan PARIYAR";
		
		System.out.println(h1.gender);
		System.out.println(h1.name);

	}

}


class Human{
	
	String name;
	Gender gender;
}