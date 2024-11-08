package StringQuestions;

public class FindNoOfOccurencesOfGivenChar2 {

	public static void main(String[] args) {
		String str = "Prasad";
		char ch = 'n';
		System.out.println(noOfOccurencesOfGivenChar(str, ch));

	}

	public static int noOfOccurencesOfGivenChar(String str, char target) {

		int count = 0;
		char[] chArray = str.toLowerCase().toCharArray();

		for (int i = 0; i <= str.length() - 1; i++) {
			if (chArray[i] == target) {
				count = count + 1;

			}
		}

		return count;

	}

}
