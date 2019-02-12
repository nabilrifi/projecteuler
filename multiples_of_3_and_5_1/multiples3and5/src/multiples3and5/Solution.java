package multiples3and5;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);

	}

}
