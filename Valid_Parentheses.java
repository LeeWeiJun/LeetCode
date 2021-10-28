package LeetCode;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		String s = "(])";
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {
		Stack<Character> sta = new Stack<Character>();
		if(s.length()<1)return false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(i==0 && ch !='(' && ch!='[' && ch!='{' )
				return false;
			if (ch == '(' || ch == '[' || ch == '{') {
				sta.push(ch);
				continue;
			}
			if(sta.size() > 0) {

				if (ch == ')' && sta.peek() == '(')
					sta.pop();
				else if (ch == ']' && sta.peek() == '[')
					sta.pop();
				else if (ch == '}' && sta.peek() == '{')
					sta.pop();
				else 
					return false;
			}
			else
				return false;
		}
		return sta.size()==0;
	}
}
