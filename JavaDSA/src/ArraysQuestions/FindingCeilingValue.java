package ArraysQuestions;

public class FindingCeilingValue {

	/**
	 * 
	 * 
	 * Smallest element in an array which is greater than or equal to the target
	 * 
	 * (Ceiling value)
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
		
		System.out.println("Ceiling value of given target is: "+ searchCeilingValue(arr, target));

		//ans : 56

	}

	
	//return the index of: Smallest number >= target
	public static int searchCeilingValue(int[] arr, int target) {

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

		return arr[start];

	}

}
