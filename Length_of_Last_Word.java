package LeetCode;

public class Length_of_Last_Word {

	public static void main(String[] args) {
		String s="Hello World ";
		String[] str= {};
		str=s.split(" ");
		int i=0;
		while(i<str.length) {
			i++;
		}
		s="";
		while(s.trim().equals("")!=false){
			i--;
			s=str[i];
		}
		System.out.println(s);
		System.out.println(lengthOfLastWord(s));
	}

    public static int lengthOfLastWord(String s) {
     int num= s.length();
     
     return num;
    }
}
