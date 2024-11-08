package recursionbasics;

public class SumOfNums {
	
	
	
	/**
	 * 
	 * 
	 * 
	 * Sum of numbers
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		System.out.println(sumOfNums(5));

	}
	
	public static int sumOfNums(int num){
		
		if(num==1){
			
			return 1;
			
		}
		
		return num+sumOfNums(num-1);
		
	}

}
