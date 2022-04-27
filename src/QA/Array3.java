package QA;

public class Array3 {
	public static void main(String[] args) {
		int[] numbArray = new int[20];
		for (int i =0;i<numbArray.length;i++) {
			numbArray[i] = (i+1);
			}
		for(int i : numbArray) {
			isEven(i);
		}
	}

	private static boolean isEven(int i) {
		if(i%2==0) {
			int j = i;
			j = j*j;
			i = j;
			System.out.println(i);
			return true;
		}else {
			int j = i;
			j = j*j*j;
			i = j;
			System.out.println(i);
			return false;
		}
		
	}

}
