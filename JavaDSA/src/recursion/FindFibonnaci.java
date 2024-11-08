package recursion;

public class FindFibonnaci {

	
	/**
	 * 
	 * Find Fibonacci Number
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int num = 7;

		System.out.println(findFibo(num));

	}

	public static int findFibo(int num) {
		if (num < 2) {
			return num;

		}

		return findFibo(num - 1) + findFibo(num - 2);

	}

}
