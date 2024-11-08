package StringQuestions;


import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String str = "Prasad stays in Pune and Pune is a beatifull city where Prasad stays and Prasad loves Cricket";
		findDuplicateWords(str);
	}

	public static void findDuplicateWords(String str) {

		boolean isDuplicateFound = false;

		String[] words = str.toLowerCase().split(" ");

		Map<String, Integer> countOfWords = new HashMap<String, Integer>();

		for (String word : words) {

			if (countOfWords.containsKey(word)) {

				countOfWords.put(word, countOfWords.get(word) + 1);

			} else {

				countOfWords.put(word, 1);
			}

		}

		for (String word : countOfWords.keySet()) {

			if (countOfWords.get(word) > 1) {

				System.out.println("Duplicate Word " + word + " found has count: " + countOfWords.get(word));
				isDuplicateFound = true;
			}

		}

		if (!isDuplicateFound) {

			System.out.println("No Duplicates found !!");
		}

	}

}