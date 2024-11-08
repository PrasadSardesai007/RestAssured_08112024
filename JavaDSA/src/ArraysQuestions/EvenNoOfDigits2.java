package ArraysQuestions;

public class EvenNoOfDigits2 {
	
	/**
	 * 
	 * Find total count of numbers having Even no of digits in an array
	 * 
	 * 
	 * 
	 * 
	 * Linear Search : (By converting number into String, and by charArray)
	 * 
	 * LeetCode (Easy)
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = { 12, 345, -56, 1, 2334,12345 };

		System.out.println("Total count of numbers having Even No of Digits: " + getCount(arr));


	}
	
	public static int getCount(int [] arr){
		int noOfDigitsCount= 0;
		
		for(int i=0; i<= arr.length-1; i++){
			// if number from array is negative
			if(arr[i]<0) {
				arr[i]=arr[i]* -1;
			}
			
			if(String.valueOf(arr[i]).toCharArray().length%2==0){
				
				noOfDigitsCount=noOfDigitsCount+1;
			}
			
			
		}
		return 	noOfDigitsCount;
		
	}
	

}
