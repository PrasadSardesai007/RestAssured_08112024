package ArraysQuestions;

/**
 * Return the index of the peak element.
 * 
 * e.g. { 1, 3, 4, 6, 8, 9, 5, 2 }
 * 
 * -->5
 * (i.e. 9 which is a peak here)
 * 
 * 
 * 
 * 
 * 
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 * (Medium)
 *
 */

public class PeakIndexMountainArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 6, 8, 9, 5, 2 };
		System.out.println(findPeakIndex(arr));

	}

	public static int findPeakIndex(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid > 0 && arr[mid] < arr[mid - 1]) {

				end = mid - 1;
			} else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;

	}

}
