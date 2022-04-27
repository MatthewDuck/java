package QA;

public class Array2 {
	public static int[] numbArray;
	public static void main(String[] args) {
		int[] numbArray = new int[9];
		for (int i =0;i<numbArray.length;i++) {
			numbArray[i] = (i+7);
			System.out.println(numbArray[i]);
			}
		for(int i =0; i<numbArray.length;i++) {
			int j = numbArray[i];
			j = j*10;
			numbArray[i] = j;
			System.out.println(numbArray[i]);
		}
		
	}
}
