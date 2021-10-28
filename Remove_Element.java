package LeetCode;

public class Remove_Element {

	public static void main(String[] args) {
		int[] arr= {3,2,2,3};
		System.out.println(removeElement(arr,3));
	}
    public static int removeElement(int[] nums, int val) {
    int i=0;
    for(int j=0;j<nums.length;j++) {
    	if(nums[j] != val) {
    		nums[i++]= nums[j];
    	}
    	else {
    		nums[j]= -1;
    	}
    }
    for(int num:nums) {
        System.out.println(num);
    }
    	return i;
    }
}
