package recursionbasics;

/**
 * 
 * 
 * Reverse Number using recursion
 * 
 * 
 * 
 * 
 *
 */

public class ReverseNumber {

	static int sum = 0;

	public static void reverseNum(int num) {

		if (num == 0) {

			return;
		}

		sum = sum * 10 + num % 10;

		reverseNum(num / 10);
	}

	public static void main(String[] args) {

		reverseNum(125634);
		System.out.println(sum);

	}



}
