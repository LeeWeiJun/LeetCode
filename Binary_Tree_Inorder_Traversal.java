package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {

	public static void main(String[] args) {
		TreeNode tr_1=new TreeNode(1);
		TreeNode tr_2=new TreeNode(2);
		TreeNode tr_3=new TreeNode(3);
		tr_1.left=null;
		tr_1.right=tr_2;
		tr_2.left=tr_3;
		tr_2.right=null;
		tr_3.left=null;
		tr_3.right=null;
		for(int i:inorderTraversal(tr_1)) {
			System.out.println(i);
		}

		
	}

    public static List<Integer> inorderTraversal(TreeNode root) {
    	ArrayList<Integer> tree=new ArrayList<Integer>();
    	if(root == null)return tree = new ArrayList(0);
    	inorderTraversal(root,tree);
        return tree;
    }
    public static void inorderTraversal(TreeNode root,List<Integer> tree) {
    	if(root.left!=null) {
    		inorderTraversal(root.left,tree);
    	}
    	tree.add(root.val);
    	if(root.right !=null) {
    		inorderTraversal(root.right,tree);
    	}
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
