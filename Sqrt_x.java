package LeetCode;

public class Sqrt_x {

	public static void main(String[] args) {
		int i=4;
		System.out.println(mySqrt(i));
	}

    public static int mySqrt(int x) {
        int start=1;
        int end=x/2;
        int mid=0;
        int ans=0;
        if(x<=0)return 0;
        if(x==1)return 1;
        while(start<=end) {
        	mid = (start+end)/2;
        	if((long)mid*mid<=x) {
        	ans=mid;
        	start = mid+1;
        	}else end=mid-1;
        }
    	return ans;
    }
}
