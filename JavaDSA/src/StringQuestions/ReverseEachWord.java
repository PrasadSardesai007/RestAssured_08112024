package StringQuestions;

public class ReverseEachWord {
	/**
	 * 
	 * 
	 * Reverse each word from the String without changing its position
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		String str= "Prasad Sardesai is in Pune City";
		
		System.out.println(reverseEachWords(str));

	}
	
	public static String reverseEachWords(String str) {
		
		String [] strArray = str.split(" ");
		
		String reverseString ="";
		
		for(int i=0; i<= strArray.length-1; i++) {
			
			reverseString=reverseString + new StringBuilder(strArray[i]).reverse().toString();
			
			if(i!= strArray.length-1) {
				reverseString=reverseString + " ";
				
			}
			
		}
		
		return reverseString;
	}

}
