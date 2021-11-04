package LeetCode;

import java.util.Arrays;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		int m=1;
		int[] nums2= {2,5,6};
		int n=nums2.length;		
		int[] nums1= new int[n+m];
		int i=0;
		while(i<=m-1) {
			nums1[i]=i+1;
			i++;
		}
		merge(nums1,m,nums2,n);
	}

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int j=0;
    	for(int i=m;i<nums1.length;i++) {
    		nums1[i]=nums2[j++];
    	}
    	Arrays.sort(nums1);
    	for(int k:nums1) {
    		System.out.println(k);
    	}
    }
}
