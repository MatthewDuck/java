package QA;

public class RiceBag1 {
	
	public static int bigBag = 1;
	public static int smallBag = 9;
	public static boolean size;
	public static int j;
	
	public static void main(String[] args) {
		System.out.println(riceCounter(9));
		System.out.println(size);
	}

	private static int riceCounter(int i) {
		 do{
			if((i - 5) >= 0 && bigBag>0) {
				i -= 5;
				bigBag--;	
			}else if((i-1)>=0 && smallBag>0) {
				i -= 1;
				smallBag--;
				j++;
			}			
		}while(i > 0 && (bigBag>0 || smallBag>0));
		 
		if(bigBag >= 0 && smallBag >= 0 && i == 0) {
				size = true;
				return j;
			}else {
				size = false;
				return -1;
			}
	}
}