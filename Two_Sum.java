package LeetCode;

import java.util.Arrays;

public class Two_Sum {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		arr = twoSum(arr, 9);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i])
					return new int[] { i, j };

			}
		}
		return new int[] {};
	}
}
