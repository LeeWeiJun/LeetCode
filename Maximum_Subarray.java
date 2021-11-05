package LeetCode;

public class Maximum_Subarray {

	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums1= {5,4,-1,7,8};
		System.out.println(maxSubArray(nums1));
	}

    public static int maxSubArray(int[] nums) {
    	int sum=nums[0];
    	int max=nums[0];
    	for(int i=1;i<nums.length;i++) {
    		if(sum <0) sum=0;
    		sum +=nums[i];		
    		if(sum > max) max=sum;
    	}	
    	return max;
    }
}
