package LeetCode;

import java.util.ArrayList;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		int[] arr= {1,1,2};
		for(int i:removeDuplicates(arr)) {
			System.out.println(i);	
		}
	}


	public static int[] removeDuplicates(int[] nums) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		for(int i : nums) {
			if(li.indexOf(i)<0)
				li.add(i);	
		}
		int[] newarr = new int[li.size()];
		for(int i=0;i<li.size();i++) {
			newarr[i]=li.get(i);
		}
	
		return newarr;   
    }
} 
