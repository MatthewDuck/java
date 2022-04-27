package QA;

public class Factorial {
	public static int fact = 1;
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	private static int factorial(int i) {
		for(int j = i; j>0; j--) {
			fact = fact*j;
		}
		return fact;
	}
}
