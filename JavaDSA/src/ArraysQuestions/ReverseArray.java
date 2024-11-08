package ArraysQuestions;

import java.util.Arrays;

public class ReverseArray {
	
	/**
	 * 
	 * 
	 * Reverse a given array
	 * 
	 * 
	 * (Considering space Complexity, second method is more efficient )
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr1 = { 17, 21, 23, 1, 3, 5, 7, 8, 15, 16 };

		System.out.println(Arrays.toString(reverseArray(arr1)));
		System.out.println(Arrays.toString(reverseArray2(arr1)));

	}

	
	//Method 1
	public static int[] reverseArray(int[] arr) {
		int[] ans = new int[arr.length];

		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {

			ans[j] = arr[i];
			j++;

		}

		return ans;

	}

	//Method 2
	public static int[] reverseArray2(int[] arr) {

		int left = 0;

		int right = arr.length - 1;

		while (left < right) {

			int temp = arr[left];

			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;

		}

		return arr;

	}

}
