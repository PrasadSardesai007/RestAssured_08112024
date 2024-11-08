package ArraysQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {

	/**
	 * 
	 * 
	 * find common elements from two arrays
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 8, 13, 15, 25, 34, 9, 10 };

		int[] arr2 = { 3, 6, 8, 12, 15, 9, 12, 21 };
		System.out.println(Arrays.toString(getCommonElements(arr1, arr2)));

	}

	public static int[] getCommonElements(int[] arr1, int[] arr2) {

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> commonSet = new HashSet<Integer>();

		for (int num : arr1) {

			set1.add(num);
		}

		for (int num : arr2) {

			if (set1.contains(num)) {

				commonSet.add(num);
			}
		}

		int[] ans = new int[commonSet.size()];

		int index = 0;
		for (int num : commonSet) {
			ans[index] = num;
			index++;
		}
		return ans;
	}

}
