package day3;

public class HelloObjects {

	public static void main(String[] args) {
		HelloObjects obj1 = new HelloObjects();
		obj1.method1();
		
		System.out.println(obj1);
	}
	
	public void method1() {
		System.out.println("I am method1");
	}

	
	@Override
	public String toString() {
		return "I am hello world object!!";
	}
	
	
}
