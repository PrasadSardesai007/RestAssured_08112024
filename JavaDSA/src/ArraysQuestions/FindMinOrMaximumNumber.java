package ArraysQuestions;

import java.util.Arrays;

public class FindMinOrMaximumNumber {

	/**
	 * 
	 * Find Minimum and Maximum number from array
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = { 23, 3455, 343, 23234, 2332, 3445, 342, 43, 9, 3312 };

		// SOlution :1
		System.out.println("Maximum Value is:" + maxNum(arr));
		System.out.println("Minimum Value is:" + minNum(arr));

		// SOlution :2
		MinAndmaxNum(arr);
		
		// SOlution :3
		MinAndMaxNums(arr);
	}

	/**
	 * 
	 * Solution 1
	 * 
	 */

	public static int maxNum(int[] arr) {

		int maxNum = arr[0];

		for (int i = 1; i <= arr.length - 1; i++) {

			if (arr[i] > maxNum) {

				maxNum = arr[i];

			}

		}
		return maxNum;

	}

	public static int minNum(int[] arr) {

		int minNum = arr[0];

		for (int i = 1; i <= arr.length - 1; i++) {

			if (arr[i] < minNum) {

				minNum = arr[i];

			}

		}
		return minNum;

	}

	/**
	 * 
	 * Solution 2
	 * 
	 */

	public static void MinAndmaxNum(int[] arr) {

		int maxNum = arr[0];
		int minNum = arr[0];

		for (int i = 1; i <= arr.length - 1; i++) {

			if (arr[i] > maxNum) {

				maxNum = arr[i];

			}

			if (arr[i] < minNum) {
				minNum = arr[i];
			}

		}
		System.out.println("Maximum Value is:" + maxNum);
		System.out.println("Minimum Value is:" + minNum);

	}

	public static void MinAndMaxNums(int[] arr) {

		Arrays.sort(arr);
		System.out.println("Maximum Value is:" + arr[arr.length - 1]);
		System.out.println("Minimum Value is:" + arr[0]);

	}

}
