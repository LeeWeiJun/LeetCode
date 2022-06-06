public class Balanced_Binary_Tree {

	private static boolean bool = true;

	public static void main(String[] args) {

		TreeNode tr_1 = new TreeNode();
//		TreeNode tr_2 = new TreeNode(9, null, null);
//
//		TreeNode tr_4 = new TreeNode(15);
//		TreeNode tr_5 = new TreeNode(7);
//		TreeNode tr_3 = new TreeNode(20, tr_4, tr_5);
//		tr_1.left = tr_2;
//		tr_1.right = tr_3;

		System.out.println(isBalanced(tr_1));
	}

	private static int count(TreeNode root) {
		if (root == null)
			return 0;

		int left = count(root.left);
		int right = count(root.right);

		if (Math.abs(left - right) > 1) {
			bool = false;
			return 0;
		}
		return Math.max(left, right) + 1;
	}

	public static boolean isBalanced(TreeNode root) {
		count(root);
		return bool;
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
