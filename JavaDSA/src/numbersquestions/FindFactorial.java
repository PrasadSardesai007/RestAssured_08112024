package numbersquestions;

public class FindFactorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(factorial2(5));
		System.out.println(factorial(5));
	}

	// with while loop: Method 1
	public static int factorial(int num) {
		int ans = 1;

		while (num != 0) {

			ans = ans * num;
			num = num - 1;

		}
		return ans;
	}

	// for loop: Method 2
	public static int factorial2(int num) {

		int fact = 1;

		for (int i = num; i >= 1; i--) {

			fact = fact * i;

		}

		return fact;

	}
	
	public static int factorial3(int num) {
		
		if(num==0) {
			return 1;
		} else {
			
			return num * factorial(num-1);
		}

	}

}
