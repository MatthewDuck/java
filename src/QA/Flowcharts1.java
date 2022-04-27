package QA;

public class Flowcharts1 {
	public static int c;
	public static void main(String[] args) {
		flow(1,2,true);
		System.out.print(c);
	}
	
	public static int flow (int a, int b, boolean bool) {
		if(bool = true) {
			c = a + b;
		}else {
			c = a * b;
		}
		return c;
		
	}

}
