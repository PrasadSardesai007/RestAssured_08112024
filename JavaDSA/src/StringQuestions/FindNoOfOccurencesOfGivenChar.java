package StringQuestions;

public class FindNoOfOccurencesOfGivenChar {

	public static void main(String[] args) {

		String str = "";

		char target = 'z';

		findNoOfOccurencesOfGivenChar(str, target);
	}

	public static void findNoOfOccurencesOfGivenChar(String str, char target) {

		if (str.isEmpty()) {

			System.out.println("Please input valid String !");
			return;
		}

		int count = str.length() - str.replace(String.valueOf(target), "").length();
		System.out.println("No of Occurences of given character " + target + " has count:" + count);

	}

}
