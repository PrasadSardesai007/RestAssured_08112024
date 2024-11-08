package numbersquestions;

public class Fibonacci {
	
	/**
	 * 
	 * 
	 * Fibonacci Series
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		fibonacci(12);
	}

	public static void fibonacci(int n) {

		int num1 = 0;
		int num2 = 1;

		System.out.println("Fibonacci Series: ");
		System.out.println(num1);
		System.out.println(num2);

		for (int i = 1; i <= n; i++) {

			int num3 = num1 + num2;

			System.out.println(num3);

			num1 = num2;
			num2 = num3;

		}

	}

}
