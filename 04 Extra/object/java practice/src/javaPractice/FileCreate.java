package javaPractice;

import java.io.File;

public class FileCreate {

	public static void main(String[] args) {
		
		for(int i = 0; i< 10 ; i++) {
			
//			createFile("hello" + i + ".txt");
			deleteFile("hello" + i + ".txt");
		}
	}
		
	
	public static void createFile(String filename) {
		try {
			
			File f = new File(filename);
			
			if (f.createNewFile()) {
				
				System.out.println("File is Created.");
				
		
			}
			
			else {
				
				System.out.println("File already exists.");
			}
			
			
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		
	}
	
	
	
	
	public static void deleteFile(String filename) {
		
try {
	
	File f = new File(filename);
	if (f.delete()) {
		
		System.out.println("File is deleted.");
		

	}
	
	else {
		
		System.out.println("File don't exists.");
	}
} catch (Exception e) {
	System.out.println("Something went wrong.");
}
	}
	

}
