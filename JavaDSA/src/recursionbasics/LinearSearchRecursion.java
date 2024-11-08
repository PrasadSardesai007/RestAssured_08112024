package recursionbasics;

public class LinearSearchRecursion {
	
	/**
	 * 
	 * 
	 * 
	 * Linear Search by using recursion
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = { 12, 43, 2, 65, 7, 345, 21 };

		int target = 65;
		System.out.println(search(arr, target, 0));

	}

	public static int search(int[] arr, int target, int index) {

		if (index > arr.length - 1) {

			return -1;
		}

		if (target == arr[index]) {

			return index;

		} else {

			return search(arr, target, index + 1);
		}

	}

}
