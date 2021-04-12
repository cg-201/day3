package day3;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Id");
		int id = scanner.nextInt();
		
		
		System.out.println("Enter First Name");
		String firstName = scanner.next();
		
		System.out.println("Enter Last Name");
		String lastName = scanner.next();
		
		
		System.out.println("Id" + id);
		System.out.println("First Name  " + firstName);
		System.out.println("Last name " + lastName);
		
		
		
		// better memomry optimisation
		scanner.close();
	}

}
