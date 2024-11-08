package ArraysQuestions;

import java.util.Arrays;

public class SecondMaxNumber2 {

	/**
	 * 
	 * 
	 * 
	 * Find Second Max Number from array
	 * 
	 * 
	 * Sort method
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = { 12, 43, 22, 11, 7, 45, 78, 33, 9, 8, 345 };
		System.out.println(secondMaxNumber(arr));

	}

	public static int secondMaxNumber(int[] arr) {

		Arrays.sort(arr);

		return arr[arr.length-2];

	}
}
