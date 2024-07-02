package javaOopsBasics;

import encapsulation.EncapsulationIntro;

public class MainClass {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.age = 25;
		p1.name = "Karan";

		Person p2 = new Person(28, "Rojita");

		System.out.println(p1.age + " " + p1.name);
		System.out.println(p2.age + " " + p2.name);

		System.out.println(Person.count);

		p1.eat();
		p2.walk(2);
		p2.walk();

		Developer d1 = new Developer(26, "Pariyar");
		d1.walk();

		EncapsulationIntro obj = new EncapsulationIntro();

		obj.doWork();

	}

}

class Developer extends Person {

	public Developer(int age, String name) {
		super(age, name);
	}

	void walk() {
		System.out.println("Developer " + name + " is walking.");

	}
}

class Person {

	String name;
	int age;

	static int count;

	public Person() {
		System.out.println("Creating an object.");
		count++;
	}

	public Person(int age, String name) {
		this();
		this.name = name;
		this.age = age;

	}

	void walk() {
		System.out.println(name + " is walking.");
	}

	void eat() {
		System.out.println(name + " is eating.");
	}

	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps.");
	}

	void doWork() {
		System.out.println("Person is working.");
	}

}