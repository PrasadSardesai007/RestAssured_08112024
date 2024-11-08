package ArraysQuestions;

public class BinarySearch {

	/**
	 * 
	 * 
	 * 
	 * Search given number in an array
	 * 
	 * 
	 * 
	 * 
	 * Binary Search
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = {};

		int target = 142;

		int index = search(arr, target);

		if (index != -1) {

			System.out.println("Target found at index: " + index);
		} else {

			System.out.println("Target was Not Found ..!!");
		}

	}

	public static int search(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;

		}

		int start = 0;
		int end = arr.length - 1;

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
