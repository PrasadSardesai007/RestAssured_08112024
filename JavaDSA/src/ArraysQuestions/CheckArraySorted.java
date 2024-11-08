package ArraysQuestions;

public class CheckArraySorted {
	
	/**
	 * 
	 * 
	 * Check if given array is sorted 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 7, 9 };

		System.out.println(isSorted(arr));

	}

	public static boolean isSorted(int[] arr) {

		int j = 0;
		for (int i = 1; i < arr.length; i++) {

			if (!(arr[i] > arr[j])) {

				return false;
			}

			j++;

		}

		return true;

	}

}
