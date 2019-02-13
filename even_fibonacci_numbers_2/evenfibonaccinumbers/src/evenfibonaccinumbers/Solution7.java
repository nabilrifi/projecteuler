package evenfibonaccinumbers;

public class Solution7 {

	public static void main(String[] args) {

		int count = 0;
		int n = 1;

		while (count != 10001) {
			if (isPrime(n)) {
				count++;
			}
			n++;
		}

		System.out.println(n - 1);
	}

	private static boolean isPrime(int n) {
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
