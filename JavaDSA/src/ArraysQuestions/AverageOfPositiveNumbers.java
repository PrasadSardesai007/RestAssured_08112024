package ArraysQuestions;

public class AverageOfPositiveNumbers {

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Find average of all the positive numbers from an array
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 3, -5, 11, 13, 5, -12, -56, 32, 121, 11, 67, -89 };

		System.out.println(average(arr));
	}

	public static int average(int[] arr) {

		int countOfNumbers = 0;
		int totalSum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {

			if (arr[i] > 0) {

				countOfNumbers = countOfNumbers + 1;
				totalSum = totalSum + arr[i];
			}
		}

		return totalSum / countOfNumbers;
	}

}
