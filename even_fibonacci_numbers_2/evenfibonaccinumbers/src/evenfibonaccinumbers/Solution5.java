package evenfibonaccinumbers;

public class Solution5 {

	public static void main(String[] args) {

		int n = 1;

		while (true) {
			if(isDiv(n)) break;
			else n++;
		}
		
		System.out.println(n);

	}

	private static boolean isDiv(int input) {
		boolean isdiv = true;
		for (int i = 1; i <= 20; i++) {
			if (input % i == 0)
				continue;
			else
				isdiv = false;
		}
		return isdiv;
	}

}
