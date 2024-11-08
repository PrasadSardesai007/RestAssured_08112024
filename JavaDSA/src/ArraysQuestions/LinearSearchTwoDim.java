package ArraysQuestions;

import java.util.Arrays;

public class LinearSearchTwoDim {
	
	/**
	 * 
	 * Find a given number in two dim array
	 * 
	 * 
	 * 
	 * 
	 * Linear Search for 2 dim
	 * 
	 */
	

	public static void main(String[] args) {
		int[][] arr = { 
				{ 12, 32, 45 }, 
				{ 32, 45, 65 }, 
				{ 12, 33 }

		};

	int target=65;
	
	System.out.println(Arrays.toString(search(arr, target)));
	

	}

	public static int [] search(int [][] arr, int target){
		
		for(int i=0; i<= arr.length-1; i++){
			
			for(int j=0; j<=arr[i].length-1; j++){
				
				if(target== arr[i][j]){
				
				return new int[] {i,j};
				
				}
				
			}
			
		}
		
		return new int [] {-1,-1};
		
		
	}

}
