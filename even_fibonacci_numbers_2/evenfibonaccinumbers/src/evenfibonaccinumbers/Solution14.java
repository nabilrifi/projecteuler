package evenfibonaccinumbers;

public class Solution14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 1000000;
		long max = 0;
		long i = 0;
		long maxnum = 0;
		while (i <= n) {
			i++;

			if (getCountCollatz(i) > max) {
				max = getCountCollatz(i);
				maxnum = i;
			}
		}

		System.out.println(maxnum);

	}

	private static long getCountCollatz(long input) {

		long count = 0;
		while (input != 1) {

			if (input % 2 == 0)
				input = input / 2;
			else
				input = 3 * input + 1;

			count++;
		}

		return count + 1;

	}

}
