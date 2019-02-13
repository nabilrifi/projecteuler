package evenfibonaccinumbers;

public class Solution {

	public static void main(String[] args) {
		int n = 4000000;
		int sum = 2;
		int fibb0 = 1;
		int fibb1 = 2;
		int fibb = 0;

		while (fibb < n) {
			fibb = fibb0 + fibb1;
			if (fibb % 2 == 0)
				sum += fibb;
			fibb0 = fibb1;
			fibb1 = fibb;
		}
		
		System.out.println(sum);

	}

}
