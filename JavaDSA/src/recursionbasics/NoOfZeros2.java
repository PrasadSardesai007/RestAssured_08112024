package recursionbasics;

public class NoOfZeros2 {
	
	/**
	 * 
	 * 
	 * Find the number of Zeros in given Number
	 * 
	 * 
	 * e.g. 104002 ---> answer is 3
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int num = 30405;
		
		System.out.println("No of Zeros in given Number:" +count(num));

	}

	public static int count(int num) {

		return helper(num, 0);
	}

	public static int helper(int num, int count) {

		if (num == 0) {
			return count;

		}

		int rem = num % 10;

		if (rem == 0) {
			return helper(num / 10, count + 1);

		} else {

			return helper(num / 10, count);
		}

	}

}
