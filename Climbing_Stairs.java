package LeetCode;

public class Climbing_Stairs {

	public static void main(String[] args) {
		int n=4;
		System.out.println(climbStairs(n));

	}

    public static int climbStairs(int n) {
        if(n<=2) return n;
        int [] nums=new int[n];
        nums[0]=1;
        nums[1]=2;
        for(int i=2;i<n;i++) {
        	nums[i]=nums[i-1]+nums[i-2];
        }
    	return nums[n-1];
    }
}
