package day3;

public class HelloWorld {
	public int number;
	public Student stdudent;
	
	// global
	public static int counter = 1;
	
	public static void main(String[] args) {
		
		System.out.println(counter); // staic member

		// Indirectly
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.number);
	}
	
	public void method1() {
		System.out.println(number); // instance member 
		System.out.println(counter); // static member
	}
}
