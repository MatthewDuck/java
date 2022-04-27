package QA;

public class BottlesChallenge {
	public static void main(String[] args) {
		bottles(99);
	}

	private static void bottles(int i) {
		for(int j = i;j>0;j--) {
			System.out.println(j + " bottles of beer on the wall, " + j + " bottles of beer,");
			System.out.println("Take one down and pass it around, " + j + " bottles of beer on the wall.");
		}
		
	}

}
