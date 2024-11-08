package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 2, 7, 6, 10, 1 };
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	public static int[] bubbleSort(int[] arr) {
		boolean swapped;

		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 1; j < arr.length - i; j++) {

				if (arr[j] < arr[j - 1]) {

					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					swapped = true;

				}

			}
			if (!swapped) {
				break;
			}
			System.out.println(Arrays.toString(arr));

		}

		return arr;
	}

}
