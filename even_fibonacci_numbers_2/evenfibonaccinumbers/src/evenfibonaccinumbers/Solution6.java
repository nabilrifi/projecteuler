package evenfibonaccinumbers;

public class Solution6 {

	public static void main(String[] args) {
		int sqsum = 0;
		int sumsq = 0;
		
		for(int i=1;i<=100;i++) {
			sqsum += i; 
		}
		sqsum = (int)Math.pow(sqsum, 2);
		
		for(int i = 1 ; i<=100; i++) {
			sumsq += Math.pow(i, 2);
		}
		
		System.out.println(sqsum - sumsq);
		
	}

}
