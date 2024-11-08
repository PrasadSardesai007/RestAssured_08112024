package ArraysQuestions;

public class SecondMaxNumber {

	/**
	 * 
	 * 
	 * 
	 * Find Second Max Number from array
	 * 
	 * 
	 * Linear Search
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 12, 43, 22, 11, 7, 45, 78, 33, 9, 8, 345 };
		
		System.out.println("Second Max Number is : " + secondMaxNumber(arr));

	}

	public static int secondMaxNumber(int[] arr) {

		int firstMax = arr[0];
		int secondMax = 0;

		for (int i = 1; i <= arr.length - 1; i++) {

			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			}

		}

		return secondMax;

	}

}
