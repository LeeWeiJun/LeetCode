package LeetCode;

import java.util.ArrayList;

public class Same_Tree {

	public static void main(String[] args) {
		TreeNode tr_1 = new TreeNode(1);
		TreeNode tr_2 = new TreeNode(2, null, null);
		TreeNode tr_3 = new TreeNode(3, null, null);
		tr_1.left = tr_2;
		tr_1.right = tr_3;

		TreeNode trr_1 = new TreeNode(1);
		TreeNode trr_2 = new TreeNode(2, null, null);
		trr_1.right = trr_2;
		trr_1.left = null;

		System.out.println(isSameTree(tr_1, trr_1));
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}


	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
