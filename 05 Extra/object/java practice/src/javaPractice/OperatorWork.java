package javaPractice;

public class OperatorWork {

	public static void main(String[] args) {
		
		int num = 100;
		
		num++; // num =  number + 1 ;
		num += 2; // num = num +2; !=  ==  < > <= >=
		num--;
		
		System.out.println("The result is : " + num);

		
		int userid = 100;
		int pin = 5555;
		
		System.out.println(userid == 100 && pin == 5555);
		System.out.println(userid == 100 || pin == 555);
	}

}
