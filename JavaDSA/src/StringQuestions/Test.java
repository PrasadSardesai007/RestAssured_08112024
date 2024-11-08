
package StringQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Test {



	public static void main(String[] args) {

		String str = "Prasad";
		
		System.out.println(removeDuplictateFromString(str));
		

	}
	
	public static String removeDuplictateFromString(String str){
		
		String ans="";
		char [] strCharArray = str.toCharArray();
		
		Set <Character> chars = new LinkedHashSet<Character>();
		
		for(char ch : strCharArray){
			chars.add(ch);
			
		}
		
		
		for(char ch :chars){
			ans= ans+ ch;
			
		}
		
		return ans;
		
	}
}
