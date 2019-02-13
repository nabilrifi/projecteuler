package evenfibonaccinumbers;

import java.util.Arrays;

public class Solution15 {

	public static void main(String[] args) {

		int[][] grid = new int[3][3];

		for (int[] row : grid) {
			Arrays.fill(row, 0);
		}

		int count = go(grid, 0, 0);

		System.out.println(count);

	}

	private static int go(int[][] grid, int i, int j) {
		int count = 0;
		if (grid[2][2] == 1) {
			grid[2][2] = 0;
			count++;
		}
		
		

		while (moveRight(grid, i, j)) {
			moveDown(grid, i, j + 1);
			return go(grid, i + 1, j + 1);
		}

		while (moveDown(grid, i, j)) {
			moveRight(grid, i + 1, j);
			return go(grid, i + 1, j + 1);
		}

		return count;
	}

	private static void moveOnce(int[][] grid, int i, int j, String direction) {
		if (direction.equals("RIGHT"))
			moveRight(grid, i, j);
		if (direction.equals("DOWN"))
			moveDown(grid, i, j);
	}

	private static boolean moveRight(int[][] grid, int i, int j) {
		if (j + 1 > 2)
			return false;
		grid[i][j + 1] = 1;

		return true;
	}

	private static boolean moveDown(int[][] grid, int i, int j) {
		if (i + 1 > 2)
			return false;
		grid[i + 1][j] = 1;

		return true;
	}
}
