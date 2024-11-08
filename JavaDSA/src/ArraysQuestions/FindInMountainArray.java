package ArraysQuestions;

public class FindInMountainArray {
	
	/**
	 * Find in Mountain Array
	 * 
	 * Find the target value in mountain array and return
	 *  the minimum index
	 * 
	 * 
	 * 
	 * 
	 * https://leetcode.com/problems/find-in-mountain-array/description/
	 * (Hard)
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 8, 9, 3, 2 };
		int target = 3;
		System.out.println(findMinimumIndex(arr, target));

	}

	public static int findMinimumIndex(int[] arr, int target) {

		int peak = findPeak(arr); // 3

		int valueIndex = binarySearch(arr, target, 0, peak);

		if (valueIndex != -1) {

			return valueIndex;
		}

		return binarySearch(arr, target, peak + 1, arr.length - 1);

	}

	public static int binarySearch(int[] arr, int target, int start, int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;

			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {

				return mid;
			}

		}

		return -1;
	}

	public static int findPeak(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid > 0 && arr[mid] < arr[mid - 1]) {
				end = mid - 1;
			} else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else {

				return mid;
			}

		}
		return -1;

	}

}
