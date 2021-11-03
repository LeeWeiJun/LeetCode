package LeetCode;

public class Plus_One {

	public static void main(String[] args) {
		int[] arr = {9,9,9};
		for (int i : plusOne(arr)) {
			System.out.println(i);
		}
	}

	public static int[] plusOne(int[] digits) {
		int len=digits.length;
		if(len == 0) {
			return digits;
		}
		for(int i=len-1;i>=0;i--) {
			if(digits[i] !=9) {
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		digits = new int[len+1];
		digits[0]=1;
		return digits;
	}
}