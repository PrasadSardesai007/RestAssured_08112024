package ArraysQuestions;


public class MaxNumFromArray {
	/**
	 * 
	 * 
	 * 
	 * 
	 * Find the maximum number from array
	 * 
	 * 
	 * Linear Search
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 32, 456, 12, 334, 567, 12, 567, 90, 54, 42343, 2323, 56, 77876, 5454 };

		System.out.println("Maximum Number is: " + maxNum(arr));

	}

	public static int maxNum(int[] arr) {

		if (arr.length == 0) {
			return -1;
		}

		int maxNum = arr[0];

		for (int i = 1; i <= arr.length - 1; i++) {

			if (arr[i] > maxNum) {
				maxNum = arr[i];

			}

		}

		return maxNum;

	}

}
