package StringQuestions;

import java.text.DecimalFormat;

public class PercentageOfCharacters {

	/**
	 * 
	 * Find The Percentage Of Uppercase Letters, Lowercase Letters, Digits And Other
	 * Special Characters In A String
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// String str = "Tiger Runs @ The Speed Of 100 km/hour.";
		// charactersPercentage(str);

		charactersPercentage("Tiger Runs @ The Speed Of 100 km/hour.");

		System.out.println("**********************************************");

		charactersPercentage("My e-mail : eMail_Address321@anymail.com");
		System.out.println("**********************************************");

		charactersPercentage("AUS : 123/3, 21.2 Overs");
		System.out.println("**********************************************");

	}

	public static void charactersPercentage(String str) {

		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitsCount = 0;
		int specialCharCount = 0;

		DecimalFormat formatter = new DecimalFormat("##.##");

		for (int i = 0; i <= str.length() - 1; i++) {

			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {

				upperCaseCount = upperCaseCount + 1;

			} else if (Character.isLowerCase(ch)) {

				lowerCaseCount = lowerCaseCount + 1;

			} else if (Character.isDigit(ch)) {

				digitsCount = digitsCount + 1;

			} else {
				specialCharCount = specialCharCount + 1;
			}
		}

		double upperCasePerc = (upperCaseCount * 100.0) / str.length();
		double lowerCasePerc = (lowerCaseCount * 100.0) / str.length();
		double digitsPerc = (digitsCount * 100.0) / str.length();
		double specialCharPerc = (specialCharCount * 100.0) / str.length();

		System.out.println("Total Capital Letters are: " + formatter.format(upperCasePerc));
		System.out.println("Total Small Letters are: " + formatter.format(lowerCasePerc));
		System.out.println("Total Digits are: " + formatter.format(digitsPerc));
		System.out.println("Total Special Characters are: " + formatter.format(specialCharPerc));

	}

}
