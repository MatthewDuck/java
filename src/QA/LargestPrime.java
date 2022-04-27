package QA;

public class LargestPrime {
	public static void main(String[] args) {
		largestPrime(455);
	}

	private static void largestPrime(int i) {
		int largest = 0;
		for(int j = (i-1); j>1; j--) {
			if ((i % j) == 0) {
				for(int k = j-1; k>1; k--) {
					if((j % k) == 0) {
						if(k>largest) {
							largest = k;
						}			
					}
				}
			}	
		}
		System.out.println(largest);
	}
}
