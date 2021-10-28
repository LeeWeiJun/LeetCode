package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

        int prev = map.get(s.charAt(0));
        int result = prev;
        
        for(int i = 1; i<s.length(); i++){
            char curr = s.charAt(i);
            int value = map.get(curr);
            
            if(prev < value) {
                result = result - prev;
                value = value - prev;
            }
            result += value;
            prev = value;
        }
        return result;
    }
}
