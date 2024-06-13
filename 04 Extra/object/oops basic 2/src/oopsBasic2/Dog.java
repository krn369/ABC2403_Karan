package oopsBasic2;

public class Dog extends Animal {
	
	public Dog() {
		//super must be the in first line
		
		super();
	}
	int x =4;
	
	public void speak() {
		
		System.out.println(super.x);
		System.out.println(this.x);
		
	}
}
