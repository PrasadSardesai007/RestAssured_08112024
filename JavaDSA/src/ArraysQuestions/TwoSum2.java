package ArraysQuestions;

import java.util.Arrays;

public class TwoSum2 {

	/**
	 * Two Sum program by using Brute Force
	 * 
	 * Time Complexity: O(n^2) Space Complexity: O(1)
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 2, 7, 12, 14, 15 };

		int target = 29;
		System.out.println(Arrays.toString(twoSum(arr, target)));

	}

	public static int[] twoSum(int[] arr, int target) {

		for (int i = 0; i <= arr.length - 1; i++) {

			for (int j = i + 1; j <= arr.length - 1; j++) {

				if (arr[i] + arr[j] == target) {

					return new int[] { i, j };

				}

			}

		}
		// return -1 if not found
		return new int[] { -1, -1 };
	}

}
