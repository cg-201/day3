package day3;

public class CastingDemo {
	
	public static void main(String[] args) {
		int num1 = 100;
		float num2 = 123.1234f;
		
		
		// logically
		float num3 = num1;
		System.out.println(num3);
		
		// data migth be lost, some precision
		int num4 = (int) num2;
		System.out.println(num4);
	}

}
