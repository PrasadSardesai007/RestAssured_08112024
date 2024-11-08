package ArraysQuestions;

public class MinNumRotatedSortedArray {

	/**
	 * 
	 * 
	 * find minimum number from rotated sorted array
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 17, 21, 23, 1, 3, 5, 7, 8, 15, 16 };

		System.out.println(findMin(arr));

	}

	public static int findMin(int[] arr) {

		return arr[findPivotIndex(arr) + 1];

	}

	public static int findPivotIndex(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {

				return mid;

			} else if (arr[mid] < arr[mid - 1]) {
				return mid - 1;
			} else if (arr[mid] < arr[start]) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}

		}

		return -1;
	}

}
