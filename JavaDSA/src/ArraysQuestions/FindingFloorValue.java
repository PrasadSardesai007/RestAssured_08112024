package ArraysQuestions;

public class FindingFloorValue {
	
	/**
	 * 
	 * 
	 * Greatest element in an array which is less than or equal to the target
	 * 
	 * (Floor value)
	 * 
	 * 
	 * 
	 * Binary Search LeetCode
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int [] arr= { 1,3,5,7,9,12,15,17,26,56,67,77};

		int target= 44;
		//ans:26

		System.out.println("Floor value of given target is: "+ findFloorValue(arr, target));
	}

	// return the index of: Greatest number <= target
	public static int findFloorValue(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;

			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return arr[mid];
			}

		}

		return arr[end];

	}

}
