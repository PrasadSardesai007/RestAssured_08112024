package StringQuestions;

public class ReverseString3 {
	/**
	 * 
	 * Reverse the String by using toCharArray method
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		String str = "";
		System.out.println(reverseString(str));

	}

	public static String reverseString(String str) {

		char[] strArray = str.toCharArray();
		String rev = "";

		for (int i = strArray.length - 1; i >= 0; i--) {

			rev = rev + strArray[i];

		}
		return rev;
	}

}
