package QA;

public class Blackjack {
	public static void main(String[] args) {
		System.out.println(blackjack(21,12));
	}
	
	public static int blackjack(int a, int b){
		if(21>=a && a>0 && 21>=b && b>0) {
		      if(a>b) {
		    	  return a;
		      }else if(a<b) {
		    	  return b;
		      }else if(a==b) {
		    	  System.out.print("Numbers are equal");
		      }	
		}else if((21<a || a<0) && 21>=b && b>0){
		    	  return b;
		}else if((21<b || b<0) && 21>=a && a>0){
	    	  return a;
		}else if((21<b || b<0) && (21<a || a<0)){
			return 0;
		}
		return 00;
		     
	}

}
