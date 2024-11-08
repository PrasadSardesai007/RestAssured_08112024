package ArraysQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateValues {
	
	/**
	 * 
	 * 
	 * Find duplicate elements in an array
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 4, 9, 12, 18, 7, 8 };

		findDuplicates(arr);
	}

	public static void findDuplicates(int[] arr) {

		boolean isDuplicateFound = false;

		Map<Integer, Integer> countOfNums = new HashMap<Integer, Integer>();

		for (int num : arr) {

			if (countOfNums.containsKey(num)) {

				countOfNums.put(num, countOfNums.get(num) + 1);

			} else {

				countOfNums.put(num, 1);
			}

		}

		for (int num : countOfNums.keySet()) {
			if (countOfNums.get(num) > 1) {

				System.out.println("Duplicate Found for " + num);
				isDuplicateFound = true;

			}

		}

		if (!isDuplicateFound) {
			System.out.println("No Duplicate found !!");

		}

	}

}
