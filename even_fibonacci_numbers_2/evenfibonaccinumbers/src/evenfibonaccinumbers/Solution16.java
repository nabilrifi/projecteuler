package evenfibonaccinumbers;

import java.math.BigInteger;

public class Solution16 {

	public static void main(String[] args) {

		BigInteger number = new BigInteger("2");

		long sum = sumOfDigits(number.pow(1000).toString());
		System.out.println(sum);

	}

	private static long sumOfDigits(String num) {
		long sum = 0;
		for (int i = 0; i < num.length(); i++) {
			System.out.println(Character.getNumericValue(num.charAt(i)));
			sum += Character.getNumericValue(num.charAt(i));
		}
		return sum;
	}

}
