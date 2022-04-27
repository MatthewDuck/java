package QA;

public class Calculator {
	public static int Bio;
	public static int Chem;
	public static int Phy;
	public static int Total;
	public static int percentage;
	
	public static void main(String[] args) {

		Calculator.results(100, 90, 80);
		Calculator.percentage();
		
		
	}
	
	public static void results(int a, int b, int c) {
		Total = a + b + c;
		System.out.print("Biology: " + a + "\n" + "Chemistry: " + b + "\n" + "Physics: " + c + "\n" + "Total: " + Total);
	}
	
	public static void percentage() {
		if(Total<450) {
			percentage = ((Total * 100) / 450);
			System.out.print("\n" + "Percentage: " + percentage);
		}else {
			System.out.print("Cant get more than 100%!");
		}
		
}
	}
	
