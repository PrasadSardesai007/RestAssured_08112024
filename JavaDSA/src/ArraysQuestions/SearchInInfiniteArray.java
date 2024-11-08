package ArraysQuestions;

public class SearchInInfiniteArray {
	/**
	 * 
	 * 
	 * 
	 * Find an element in an infinite array
	 * 
	 * 
	 * 
	 * 
	 * 
	 *
	 *Binary Search
	 *
	 * Amazon Interview Question
	 */

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 8, 12, 14, 16, 34, 38, 46, 59, 67, 81, 89, 91, 101 };

		int target = 16;

		System.out.println(search(arr, target));

	}

	public static int search(int[] arr, int target) {

		int start = 0;
		int end = 1;

		while (target > arr[end]) {

			int temp = end + 1;

			end = end + (end - start + 1) * 2;

			start = temp;

		}

		return searchInfiniteArray(arr, target, start, end);

	}

	public static int searchInfiniteArray(int[] arr, int target, int start, int end) {

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
