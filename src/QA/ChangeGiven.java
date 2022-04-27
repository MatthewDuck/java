package QA;

public class ChangeGiven {	
		public static int i = 0;
		public static int j = 0;
		public static int k = 0;
		public static int l = 0;
		public static int m = 0;
	public static void main(String[] args) {
		change(4.58,20.00);
	}

	private static void change(double a, double b) {
		int d = (int)(a * 100);
		int e = (int)(b * 100);
		do{
			if((d + 1000)<= e){
				i++;
				d += 1000;
			}else if((d + 500)<= e){
				j++;
				d += 500;
			}else if((d + 20)<= e) {
				k++;
				d += 20;
			}else if((d + 02)<= e) {
				l++;
				d += 02;
			}else if((d + 01)<= e) {
				m++;
				d += 01;
			}else {
				System.out.println(d);
			} 
		}while(d != e);
		System.out.print("£10: " + i + "\n" + "£5: " + j + "\n" + "20p: " + k +"\n" + "2p: " + l + "\n" + "1p: " + m);
	}
}