package day3;

public class SytstemExitDemo {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		// System.out.println("1");
		
		
		
		// System.exit(0);
		for(int i=0; i<1000000000; i++) {}
		
		
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
		
	}
}
