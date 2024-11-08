package ArraysQuestions;

public class EvenNoOfDigits {
	
	/**
	 * 
	 * Find total count of numbers having Even no of digits in an array
	 * 
	 * 
	 * 
	 * 
	 * Linear Search
	 * 
	 * LeetCode (Easy)
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = { 12, 345, -56, 1, 2334, 12345 };

		System.out.println("Total count of numbers having Even No of Digits: " + getCount(arr));

	}

	public static int getCount(int[] arr) {
		int noOfDigitsCount = 0;

		for (int i = 0; i <= arr.length - 1; i++) {

			if (noOfDigits(arr[i]) % 2 == 0) {

				noOfDigitsCount = noOfDigitsCount + 1;
			}

		}
		return noOfDigitsCount;

	}

	public static int noOfDigits(int num) {

		int count = 0;

		while (num > 0) {
			count = count + 1;
			num = num / 10;

		}

		return count;
	}

}
