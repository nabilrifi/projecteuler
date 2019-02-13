package evenfibonaccinumbers;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i = 100;i<1000;i++) {
			for (int j = 100;j<1000;j++) {
				if(isPalindrome(i*j)) {
					if(i*j>max) max = i*j;
				}
			}
		}
		System.out.println(max);
		
	}
	
	private static boolean isPalindrome(int input) {
		
		String original = String.valueOf(input);
		String reverse = "";
		int length = original.length();
		for (int i = length-1; i>=0 ; i --) {
			reverse+= original.charAt(i);
		}
		
		if(original.equals(reverse)) return true;
		else return false;
		
	}

}
