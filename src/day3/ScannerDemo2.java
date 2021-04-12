package day3;

import java.util.Scanner;

public class ScannerDemo2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter Last Name");
		String lastName = scanner.nextLine();
		
		System.out.println("First Name  " + firstName);
		System.out.println("Last name " + lastName);
		
		// better memomry optimisation 
		scanner.close();
	}

}
