package ArraysQuestions;

import java.util.Arrays;

public class FirstAndLastPosition {

	/**
	 * 
	 * Find First and Last Position of Element in Sorted Array
	 * 
	 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
	 * 
	 * 
	 * LeetCode: Asked in Facebook interview (Medium)
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 5, 5, 7, 7, 7, 7, 7, 7, 8, 8, 8, 10, 10, 10, 10 };

		int target = 10;

		System.out.println(Arrays.toString(findFirstAndLastPosition(arr, target)));

	}

	public static int[] findFirstAndLastPosition(int[] arr, int target) {
		int index1 = searchLeft(arr, target);
		int index2 = searchRight(arr, target);

		return new int[] { index1, index2 };

	}

	public static int searchLeft(int[] arr, int target) {

		int start = 0;

		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;

			} else if (target < arr[mid]) {
				end = mid - 1;

			} else {
				if (mid == 0 || arr[mid - 1] < arr[mid]) {
					return mid;

				} else {

					end = mid - 1;

				}

			}

		}
		return -1;

	}

	public static int searchRight(int[] arr, int target) {

		int start = 0;

		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;

			} else if (target < arr[mid]) {
				end = mid - 1;

			} else {
				if (mid == arr.length - 1 || arr[mid + 1] > arr[mid]) {
					return mid;

				} else {

					start = mid + 1;
					// end=arr.length - 1;
				}

			}

		}
		return -1;

	}

}
