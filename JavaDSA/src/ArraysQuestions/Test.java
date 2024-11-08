package ArraysQuestions;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int num = 28;
		System.out.println(isPerfectNumber(num));
	}

	public static boolean isPerfectNumber(int num) {

		if (num < 1) {
			return false;

		}

		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {

			if (num % i == 0) {
				sum = sum + i;

			}

		}

		if (sum == num) {

			return true;
		} else {
			return false;
		}

	}

}
