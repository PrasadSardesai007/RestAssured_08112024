package StringQuestions;

public class ReverseString2 {
	/**
	 * 
	 * Reverse String by using StringBuilder and StringBuffer
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String str= "Prasad";
		
		System.out.println(reverseOne(str));
		System.out.println(reverseTwo(str));
		
		
	}

	public static String reverseOne(String str) {

		return new StringBuilder(str).reverse().toString();
	}

	public static String reverseTwo(String str) {

		return new StringBuffer(str).reverse().toString();
	}

}
