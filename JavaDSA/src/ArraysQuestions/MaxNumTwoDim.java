package ArraysQuestions;

public class MaxNumTwoDim {

	/**
	 * 
	 * 
	 * Find Maximum number is a 2 dim array
	 * 
	 * 
	 * Linear Search
	 * 
	 */

	public static void main(String[] args) {
		int[][] arr = { 
				{ 12, 32, 45 }, 
				{ 32, 45, 65 }, 
				{ 12, 33, 11 }

		};

		System.out.println("Maximum Number is: " +maxNum(arr));

	}

	public static int maxNum(int[][] arr) {
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length - 1; i++) {

			for (int j = 1; j <= arr[i].length - 1; j++) {

				if (arr[i][j] > maxNum) {
					maxNum = arr[i][j];
				}
			}

		}

		return maxNum;

	}

}
