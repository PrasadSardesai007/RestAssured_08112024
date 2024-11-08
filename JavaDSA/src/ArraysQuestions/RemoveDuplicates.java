package ArraysQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	/**
	 * 
	 * 
	 * Remove duplicates from array
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9 };
		System.out.println(Arrays.toString(removeDuplicates(arr)));

	}

	public static int[] removeDuplicates(int[] arr) {

		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int num : arr) {

			set.add(num);

		}

		int[] ans = new int[set.size()];

		int index = 0;
		for (int num : set) {
			ans[index] = num;
			index++;

		}

		return ans;
	}

}
