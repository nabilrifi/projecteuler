package evenfibonaccinumbers;

import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {

		int[][] grid = new int[20][20];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for (int j = 0; j < 20; j++) {

			String line = scanner.nextLine();
			String[] split = line.split(" ");
			for (int i = 0; i < 20; i++) {
				grid[j][i] = Integer.parseInt(split[i]);
			}
		}

		int product1 = 0; // up
		int product2 = 0; // down
		int product3 = 0; // left
		int product4 = 0;// right
		int product5 = 0;// diagonal
		int product6 = 0;// diagonal
		int product7 = 0;// diagonal
		int max = 0;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				// up
				try {
					product1 = grid[i][j] * grid[i][j - 1] * grid[i][j - 2] * grid[i][j - 3];
					if (product1 > max)
						max = product1;
				} catch (Exception e) {

				}
				// down
				try {
					product2 = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
					if (product2 > max)
						max = product2;

				} catch (Exception e) {

				}
				// left
				try {
					product3 = grid[i][j] * grid[i - 1][j] * grid[i - 2][j] * grid[i - 3][j];
					if (product3 > max)
						max = product3;
				} catch (Exception e) {

				}
				// right
				try {
					product4 = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
					if (product4 > max)
						max = product4;
				} catch (Exception e) {

				}
				// diagonal
				try {
					product5 = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
					if (product5 > max)
						max = product5;
				} catch (Exception e) {

				}
				// diagonal
				try {
					product6 = grid[i][j] * grid[i - 1][j - 1] * grid[i - 2][j - 2] * grid[i - 3][j - 3];
					if (product6 > max)
						max = product6;
				} catch (Exception e) {

				}

				try {
					product7 = grid[i][j] * grid[i - 1][j + 1] * grid[i - 2][j + 2] * grid[i - 3][j + 3];
					if (product7 > max)
						max = product7;
				} catch (Exception e) {

				}

			}
		}

		System.out.println(max);

	}

}
