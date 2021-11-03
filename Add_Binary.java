package LeetCode;

public class Add_Binary {

	public static void main(String[] args) {
		String a="1010",b="1011";
		System.out.println(addBinary(a,b));
	}
	
    public static String addBinary(String a, String b) {
    	StringBuilder str=new StringBuilder();
    	int i=a.length()-1;
    	int j=b.length()-1;
    	int result=0;
    	while(i>=0 || j>=0) {
    		int sum=result;
    		if(i>=0) {
    			sum +=a.charAt(i) - '0';
    		}
    		if(j>=0) {
    			sum +=b.charAt(j)-'0';
    		}
        	str.append(sum%2);
        	result = sum/2;
        	i--;
        	j--;
    	}
    	if(result !=0) {
    		str.append(result);
    	}

    	return str.reverse().toString();
    }
}
