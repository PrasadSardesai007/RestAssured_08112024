package sorting;

import java.util.Arrays;
/**
 * 
 * 
 * 
 * 
 * Selection Sort technique to sort unsorted array
 * 
 * 
 * 
 * 
 * 
 *
 */

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 18, 2, 7, 4, 13, 15 };

		System.out.println(Arrays.toString(selectionSort(arr)));

	}

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int lastIndex = arr.length - i - 1;

			int maxIndex = getMaxIndex(arr, 0, lastIndex);

			int temp = arr[lastIndex];
			arr[lastIndex] = arr[maxIndex];
			arr[maxIndex] = temp;

		}

		return arr;
	}

	public static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;

		for (int i = start; i <= end; i++) {

			if (arr[max] < arr[i]) {
				max = i;

			}

		}

		return max;

	}

}
