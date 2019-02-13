package evenfibonaccinumbers;

public class Solution3 {

	public static void main(String[] args) {
		long input = 600851475143L;

		System.out.println(largestPrimeFactor(input));

	}

	public static int largestPrimeFactor(long number) {
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        return i;
    }

}
