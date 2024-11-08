package StringQuestions;

public class RotationOfAnotherString {

	public static void main(String[] args) {
		String string1 = "StrutsHibernateJavaJ2ee";
		String string2 = "J2eeStrutsHibernateJava";
		System.out.println(isRotationOfAnotherString(string1, string2));

	}

	public static boolean isRotationOfAnotherString(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;

		}

		String str3 = str2 + str2;

		if (str3.contains(str1)) {
			return true;
		} else {
			return false;
		}

	}

}
