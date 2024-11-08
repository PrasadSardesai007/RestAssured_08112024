package StringQuestions;

public class ReverseString1 {
	/**
	 * 
	 * 
	 * 
	 * Reverse String Recursion
	 * 
	 * 
	 */
	public static void main(String[] args) {

		String str = "";
		System.out.println(reverseByRecursion(str));

	}

	public static String reverseByRecursion(String str) {
		
		if(str.length()<=1 || str==null) {

			return str;
		
	}
		
		return reverseByRecursion(str.substring(1))+ str.charAt(0);

}
}