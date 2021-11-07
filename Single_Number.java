package LeetCode;

public class Single_Number {

	public static void main(String[] args) {
		int[] nums = { 4, 2, 1, 2, 1 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int single = nums[0];
		for(int i=1;i<nums.length;i++) {
			single = single ^ nums[i];
		}
		return single;
	}
}
