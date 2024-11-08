package recursion;

public class HappyNumber {

	/**
	 * 
	 * 
	 * 
	 * 202. Happy Number
	 * 
	 * LeetCode:https://leetcode.com/problems/happy-number/description/ JPMorgan
	 * Question (Easy)
	 */

	public static void main(String[] args) {
		int num = 19;

		int ans = getNumber(num);

		if (ans == 1) {
			System.out.println("Given number is a Happy Number !");
		} else {
			System.out.println("Not a Happy Number !!");
		}

	}

	public static int getNumber(int num) {

		int sum = 0;

		while (num > 0) {

			sum = sum + (num % 10) * (num % 10);
			num = num / 10;
		}

		if (sum < 10) {
			return sum;

		}

		return getNumber(sum);

	}

}
