package LeetCode;

public class Palindrome_Number {

	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));

	}

	public static boolean isPalindrome(int x) {
		String changeX = Integer.toString(x);
		StringBuffer buffer = new StringBuffer(changeX);
		if(!changeX.equals(buffer.reverse().toString()))return false;
		return true;
	}
}
