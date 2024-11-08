package ArraysQuestions;

public class MissingNumber {
	
	/**
	 * 
	 * 
	 * Find the missing number from array
	 * 
	 * e.g. { 1, 2, 3, 4, 6, 7 }
	 * 
	 * ans--> 5
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7 };

		System.out.println("Missing number is: " + missingNumber(arr));

	}

	public static int missingNumber(int[] arr) {

		int n = arr.length + 1;
		int expTotal = n * (n + 1) / 2;

		int actTotal = 0;

		for (int i = 0; i <= arr.length - 1; i++) {

			actTotal = actTotal + arr[i];

		}

		return expTotal - actTotal;

	}

}
