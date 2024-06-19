package javaPractice;

public class AbstractWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HarryPoter h1  = new HarryPoter();
		h1.bookapages();
		h1.printBookadetails();
		
		WorkHardPlayHard w1 = new WorkHardPlayHard();
		w1.bookapages();
		w1.printBookadetails();
	}

}

abstract class Booka{
	
	public abstract void bookapages();
	
	public void printBookadetails() {
		
		System.out.println("Book Details.");
	}
}

class HarryPoter extends Booka{
	
	public void bookapages() {
		
		System.out.println("100 pages");
	}
}

class WorkHardPlayHard extends Booka{
public void bookapages() {
		
		System.out.println("69 pages");
	}
	
}