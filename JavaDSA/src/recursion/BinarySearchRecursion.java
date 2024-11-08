package recursion;

public class BinarySearchRecursion {
	
	/**
	 * 
	 * Binary Search using recursion
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 9, 12, 16, 19, 22, 27, 29, 32, 34 };

		int target = 27;
		//ans:8
		
		System.out.println(binarySearch(arr, target, 0, arr.length-1));

	}

	public static int binarySearch(int[] arr, int target, int start, int end) {

		if (start > end) {

			return -1;
		}
		int mid = start + (end - start) / 2;

		if (target == arr[mid]) {

			return mid;

		}

		if (target > arr[mid]) {

			return binarySearch(arr, target, mid + 1, end);
		}

		return binarySearch(arr, target, start, mid - 1);

	}

}
