package ArraysQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/**
	 * Two Sum program by using map
	 * 
	 * Time Complexity: O(n) Space Complexity: O(n)
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int[] arr = { 2, 7, 12, 14, 15 };

		int target = 29;
		System.out.println(Arrays.toString(twoSum(arr, target)));

	}

	public static int[] twoSum(int[] arr, int target) {

		Map<Integer, Integer> nums = new HashMap<Integer, Integer>();

		for (int i = 0; i <= arr.length - 1; i++) {
			int complement = target - arr[i];

			if (nums.containsKey(complement)) {

				return new int[] { nums.get(complement), i };

			}

			nums.put(arr[i], i);

		}
		// if no answer found
		return new int[] { -1, -1 };
	}

}
