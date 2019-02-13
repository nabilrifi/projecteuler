package evenfibonaccinumbers;

public class Solution10 {

	public static void main(String[] args) {
		long sum = 0;

		for (long i = 1; i < 2000000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				sum += i;
			}

		}

		System.out.println(sum);

	}

	private static boolean isPrime(long n) {

		if (n == 1)
			return false;
		// check if n is a multiple of 2
		if (n != 2 && n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
