package QA;

public class Numbers {
	public static int l = 0;
	public static void main(String[] args) {
		multiply(111111111);
	}

	private static void multiply(int i) {
			while(i>0) {
				l += (i % 10);
				i = i/10;		
			}
			System.out.println(l);	
	}
}
