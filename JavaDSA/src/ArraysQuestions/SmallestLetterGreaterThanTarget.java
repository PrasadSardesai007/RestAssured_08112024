package ArraysQuestions;

public class SmallestLetterGreaterThanTarget {
	
	/**
	 * 
	 * Find Smallest Letter Greater Than Target
	 * 
	 * 
	 * 
	 * LeetCode:https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
	 * 
	 * Binary Search
	 */

	public static void main(String[] args) {

		char [] arr= { 'x','x','y','y'};

		char target= 'z';
		
		System.out.println(search(arr, target));
		
	}

	public static char search(char[] arr, int target) {

		int start = 0;

		int end = arr.length - 1;

		if (target >= arr[end] || target < arr[start]) {

			return arr[start];
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;

			} else {
				return arr[mid + 1];
			}

		}

		return arr[start];
	}

}
