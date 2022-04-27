package QA;

public class Numbers2 {
	private static final String[] numNames = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	private static final String[] tensNames = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	private static final String[] greaterNames = {"", "hundred", "thousand"};
	private static int thou;
	private static int hund;
	private static int tens;
	private static int ints;
	
	public static void main(String[] args) {
		calculate(2222);
	}
	
	private static void calculate(int i) {
		do{
			tens = (i%100);
			i=i/100;
			hund = (i%10);
			i=i/10;
			thou = (i%10);
			i=i/10;
		} while (i>0);
		
		if(thou>0 && (hund>0)) {
			System.out.print(numNames[thou] + "-" + greaterNames[2] +  "-");
		}else if(thou>0 && tens>0 && hund == 0) {
			System.out.print(numNames[thou] + "-" + greaterNames[2] + " and ");
		}else if(thou>0 && hund == 0 && tens == 0) {
			System.out.print(numNames[thou] + "-" + greaterNames[2]);
		}
		if(hund>0 && tens>0) {
			System.out.print(numNames[hund] + "-" + greaterNames[1] + " and ");
		}else if(hund>0) {
			System.out.print(numNames[hund] + "-" + greaterNames[1]);
		}
		if(tens>0 && tens<=20) {
			System.out.print(numNames[tens]);
		}else if (tens>20) {
			ints = (tens%10);
			tens = tens/10;
			if(ints>0){
				System.out.print(tensNames[tens] + "-" + numNames[ints]);
			}else {
				System.out.print(tensNames[tens]);
			}
		}
	}
}
