package day3;

import java.util.Scanner;

public class ScannerDemo1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of times loop exeuctes:: ");
		int n = scanner.nextInt();
		
		
		for(int i=0; i<n; i++) {
			System.out.println(i);
		}
		
		
		scanner.close();
	}

}
