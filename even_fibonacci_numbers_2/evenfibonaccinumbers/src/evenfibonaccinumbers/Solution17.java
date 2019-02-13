package evenfibonaccinumbers;

import java.util.HashMap;

public class Solution17 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		numbers.put(1, 3);
		numbers.put(2, 3);
		numbers.put(3, 5);
		numbers.put(4, 4);
		numbers.put(5, 4);
		numbers.put(6, 3);
		numbers.put(7, 5);
		numbers.put(8, 5);
		numbers.put(9, 4);
		numbers.put(10, 3);
		numbers.put(11, 6);
		numbers.put(12, 6);
		numbers.put(13, 8);
		numbers.put(14, 8);
		numbers.put(15, 7);
		numbers.put(16, 7);
		numbers.put(17, 9);
		numbers.put(18, 8);
		numbers.put(19, 8);
		numbers.put(100, 7);
		numbers.put(1000, 8);
		numbers.put(-1, 3);

		HashMap<Integer, Integer> dizaine = new HashMap<Integer, Integer>();
		dizaine.put(2, 6);
		dizaine.put(3, 6);
		dizaine.put(4, 5);
		dizaine.put(5, 5);
		dizaine.put(6, 5);
		dizaine.put(7, 7);
		dizaine.put(8, 6);
		dizaine.put(9, 6);
		int count = 0;
		for (int i = 1; i <= 1000; i++) {

			if (i < 20) {
				count += numbers.get(i);
			}

			if (i > 20) {
				if (String.valueOf(i).length() < 3) {

					String number = String.valueOf(i);
					int diz = Integer.parseInt(String.valueOf(number.charAt(0)));
					int unit = Integer.parseInt(String.valueOf(number.charAt(1)));
					if (unit != 0) {
						count += numbers.get(unit);
					}
					count += dizaine.get(diz);

				}
				if (String.valueOf(i).length() == 3) {

					String number = String.valueOf(i);
					int hun = Integer.parseInt(String.valueOf(number.charAt(0)));
					int diz = Integer.parseInt(String.valueOf(number.charAt(1)));
					int unit = Integer.parseInt(String.valueOf(number.charAt(2)));
					if (diz < 2 && diz != 0) {
						int teen = Integer.parseInt(number.substring(number.length() - 2));
						count += numbers.get(teen);
					} else if (diz < 2 && diz == 0 && unit != 0) {
						System.out.println(unit);
						count += numbers.get(unit);
					}

					else {

						if (diz != 0) {
							count += dizaine.get(diz);
						}
						if (unit != 0) {
							count += numbers.get(unit);
						}
					}

					count += numbers.get(100);
					count += numbers.get(-1);
					count += numbers.get(hun);

				}
				if (String.valueOf(i).length() > 3) {
					String number = String.valueOf(i);
					int hun = Integer.parseInt(String.valueOf(number.charAt(0)));
					count += numbers.get(1000);
					count += numbers.get(hun);

				}
			}

		}

		System.out.println(count);
	}

}
