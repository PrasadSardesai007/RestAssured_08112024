package ArraysQuestions;

public class NoOfRotation {

	/**
	 * 
	 * Find No of Rotation.
	 * 
	 * How many times an array is rotated
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

		// {0,1,2,4,5,6,7}

		// ans: 4

		System.out.println(noOfRotation(arr));
	}

	public static int noOfRotation(int[] arr) {

		int noOfRotation = findPivot(arr);

		return noOfRotation + 1;

	}

	public static int findPivot(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {

				return mid;
			} else if (mid > 0 && arr[mid] < arr[mid - 1]) {

				return mid - 1;
			} else if (arr[mid] < arr[end]) {

				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return -1;
	}
}
