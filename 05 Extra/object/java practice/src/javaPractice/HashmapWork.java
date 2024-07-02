package javaPractice;

import java.util.HashMap;

public class HashmapWork {

	public static void main(String[] args) {
		
		HashMap<String, String> personalDetails = new HashMap<String, String>();
		
		// Adding Keys and Values.
		
		personalDetails.put("name", "Karan");
		personalDetails.put("address", "Mulhouse, France");
		personalDetails.put("Fathername", "Ramesh Pariyar");
		personalDetails.put("Mothername", "Sita Sukupayo");
		
		System.out.println(personalDetails);
		System.out.println(personalDetails.get("name"));

	}

}
