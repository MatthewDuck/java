package QA;

public class Array1 {
	public static int[] numbArray = new int[10];
	
	public static void main(String[] args) {
		for (int j = 0;j<10;j++) {
			numbArray[j] = j;
		}
		for(int i : numbArray) {
			System.out.println("Number: " + i);
		 }
	}
}
