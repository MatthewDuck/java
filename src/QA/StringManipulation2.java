package QA;

public class StringManipulation2 {
	public static int wordCount = 1;
	static char space = ' ';
	public static String sentence = "";
	public static String word = "";

	public static void main(String[] args) {
		System.out.println(length(" "));
		verticalPrintBack("Hello World");
		System.out.println(verticalPrintWord("Hello World World"));
	}
	
	private static String verticalPrintWord(String string) {
		for (int i = 0; i <string.length(); i++) {
			if(string.charAt(i) == space) {
				sentence = word + "\n" + sentence ;
				word = "";
			}else {
				word += string.charAt(i);
			}
		}
		sentence = word + "\n" + sentence;
		return sentence;
	}

	private static void verticalPrintBack(String string) {
		for (int i = string.length() - 1; i >=0; i--) {
			if(string.charAt(i) == space) {
				System.out.print("\n");
			}else {
				System.out.print(string.charAt(i));
			}
		}
	}

	private static int length(String a) {
		for (int i = 1; (i + 1) < (a.length()); i++) {
			if (a.charAt(i + 1) != space && a.charAt(i) == space) {
				wordCount++;
			} else if(a.charAt(0) == space) {
				wordCount --;
			}else {
				
			}
		}
		return wordCount;
	}
}
