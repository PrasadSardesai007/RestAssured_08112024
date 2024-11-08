package recursionbasics;

public class ProductOfDigits {
	
	/**
	 * 
	 * 
	 * 
	 * Products of Digits
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		System.out.println(productOfDigits(13409));

	}

	public static int productOfDigits(int num) {

		if (num == 0) {

			return 1;
		}

		return num % 10 * productOfDigits(num / 10);

	}


}
