package StringQuestions;

public class ReversePreservingPositionOfSpaces {
	/**
	 * 
	 * 
	 * 
	 * Reverse The String With Preserving The Position Of Spaces
	 * 
	 */
	public static void main(String[] args) {
		String str = "My name is Prasad Sardesai";
		System.out.println(reverse(str));

	}

	public static String reverse(String str) {

		char[] strArray = str.toCharArray();

		char[] revArray = new char[strArray.length];

		// First to add spaces
		for (int i = 0; i <= strArray.length - 1; i++) {

			if (strArray[i] == ' ') {

				revArray[i] = ' ';

			}

		}

		int j = strArray.length - 1;

		for (int i = 0; i <= strArray.length - 1; i++) {

			if (revArray[i] != ' ') {

				if (strArray[j] == ' ') {
					j--;
				}

				revArray[i] = strArray[j];
				j--;
			}

		}
		return String.valueOf(revArray);
	}

}
