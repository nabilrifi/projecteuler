package evenfibonaccinumbers;

public class Solution9 {

	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			for (int j = 0; j <= 1000; j++) {
				for (int k = 0; k <= 1000; k++) {
					if (i + j + k == 1000) {
						if (isPyth(i, j, k)) {
							System.out.println(i * j * k);
							break;
						}
					}
				}
			}
		}
	}

	private static boolean isPyth(int i, int j, int k) {
		if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
			return true;
		} else
			return false;
	}

}
