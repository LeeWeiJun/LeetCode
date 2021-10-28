package LeetCode;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		String[] strs = {"ab","a"};
		System.out.println(longestCommonPrefix(strs));

	}

	public static String longestCommonPrefix(String[] strs) {
		String str1 = strs[0];
		for(String s : strs) {
			 if(str1.length() >s.length()) {
				 str1=s;
			 }
		}
		for(String s : strs) {
			for(int i=0;i<s.length();i++) {
				if(i<str1.length() &&  str1.substring(i, i+1).equals(s.substring(i, i+1)) == false) {
					str1 = s.substring(0, i);
				}
			}
			
		}
		return str1;
	}
}