package evenfibonaccinumbers;

public class Solution12 {

	public static void main(String[] args) {
		int nbDivisors = 0;
		int n = 0;

		while (nbDivisors < 500) {
			n++;
			nbDivisors = getNbDivisors(getTriangular(n));

		}
		System.out.println(nbDivisors);
		System.out.println(getTriangular(n));

	}

	private static int getNbDivisors(int n) {
		int cnt = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				// If divisors are equal,
				// count only one
				if (n / i == i)
					cnt++;

				else // Otherwise count both
					cnt = cnt + 2;
			}
		}
		return cnt;
	}

	private static int getTriangular(int n) {
		int triangular = 0;
		for (int i = 1; i <= n; i++) {
			triangular += i;
		}

		return triangular;
	}

}
