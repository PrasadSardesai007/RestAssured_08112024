package ArraysQuestions;

public class RotatedSortedArray {

	/**
	 * 
	 * Search in Rotated Sorted Array
	 * 
	 * 
	 * 
	 * 
	 * 
	 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
	 * (Medium)
	 * 
	 * Amazon and Google Interview Question
	 */
	public static void main(String[] args) {

		int[] arr = { 10, 12, 14,17,23, 2, 4, 6, 7, 8, 9 };

		int target = 29;
		System.out.println(search(arr, target));

	}

	public static int search(int[] arr, int target) {

		int pivotIndex = findPivotIndex(arr);
		

		int leftSearch = binarySearch(arr, target, 0, pivotIndex + 1);

		if (leftSearch != -1) {
			return leftSearch;

		}

		return binarySearch(arr, target, pivotIndex + 1, arr.length - 1);

	}

	public static int findPivotIndex(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
				return mid;

			} else if (mid > 0 && arr[mid] < arr[mid - 1]) {

				return mid - 1;
			} else if (arr[mid] > arr[end]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return -1;
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

}
