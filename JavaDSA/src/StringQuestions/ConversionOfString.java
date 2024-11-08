package StringQuestions;

public class ConversionOfString {

	public static void main(String[] args) {

		//String to integer--->
		String str1 = "1243";
		int num2 = Integer.valueOf(str1);
		int num3 =Integer.parseInt(str1);
		
		
		
		//Integer to String
		int num1 = 1223;
		String str2 = String.valueOf(num1);
		String str3=Integer.toString(num1);
		
		
		System.out.println("Converting String to Integer !!");
		System.out.println(str1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("Converting Integer to String !!");
		System.out.println(num1);
		System.out.println(str2);
		System.out.println(str3);
		

	}

}
