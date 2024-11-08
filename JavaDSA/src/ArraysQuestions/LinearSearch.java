package ArraysQuestions;

public class LinearSearch {

	/**
	 * 
	 * 
	 * Check whether given number is present or not
	 * 
	 * Linear Search
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 8, 12, 33, 56, 57, 95, 121 };
		int target = 13;
		System.out.println(isNumPresent(arr, target));

	}

	public static boolean isNumPresent(int[] arr, int target) {

		if (arr.length == 0) {
			return false;
		}

		for (int num : arr) {

			if (num == target) {
				return true;
			}
		}

		return false;

	}

}
