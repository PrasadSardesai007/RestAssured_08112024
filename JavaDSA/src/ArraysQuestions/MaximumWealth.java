package ArraysQuestions;

public class MaximumWealth {
	
	/**
	 * 
	 * Richest Customer Wealth
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Linear Search
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[][] arr = { { 1, 3, 6 }, { 4, 6, 8 }, { 7, 7, 1 }

		};

		System.out.println("Maximum Wealth is : " + maximumWealth(arr));

	}

	public static int maximumWealth(int[][] arr) {

		int maxWealth = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j <= arr[i].length - 1; j++) {
				count = count + arr[i][j];

			}

			if (count > maxWealth) {
				maxWealth = count;
			}

		}

		return maxWealth;
	}
}
