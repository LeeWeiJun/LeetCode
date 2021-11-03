package LeetCode;

public class Search_Insert_Position {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		int target = 2;
		System.out.println(searchInsert(arr, target));
	}

	public static int searchInsert(int[] nums, int target) {
		int con = nums.length;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] != target) {
				if (nums[i] < target) {
					con = i + 1;
					break;
				} else if (i > 0 && nums[i] > target && nums[i - 1] < target) {
					con = i;
					break;
				} else if(i==0 && nums[i] > target){
					con = i;
					break;
				}
			} else {
				con = i;
				break;
			}
		}
		return con;
	}
}
