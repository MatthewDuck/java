package QA;

public class StringManipulation1 {
	public static void main(String[] args) {
		String a = "yesterday it was raining";
		String b = "today it is sunny";
		System.out.println(a.toUpperCase() + ", " + b.toUpperCase());
		String c = a.substring(16, 24);
		String d = b.substring(0, 11);
		System.out.println(d + c);
		
	}
}
