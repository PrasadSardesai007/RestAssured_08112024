package StringQuestions;

public class CountNoOfWords {
/**
 * 
 * 
 * 
 * Count no of words in given String
 * 
 * 
 */
	
	
	public static void main(String[] args) {
		String str = "Prasad stays in Pune and Pune is a beatifull city where Prasad stays and Prasad loves Cricket";

		System.out.println(countNoOfWords(str));

	}

	public static int countNoOfWords(String str) {
		String[] words = str.trim().split(" ");

		return words.length;

	}

}
