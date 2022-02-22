using System;
using System.Linq;

namespace Convert_Sorted_Array_to_Binary_Search_Tree
{
    class Convert_Sorted_Array_to_Binary_Search_Tree
    {
        static void Main(string[] args)
        {
            int[] arr = { -10, -3, 0, 5, 9 };
            SortedArrayToBST(arr);

            Console.Read();
        }

        public static  TreeNode SortedArrayToBST(int[] nums)
        {
            if (nums.Length == 0)
            {
                Console.WriteLine("null");
                return null;

            }
            int length = nums.Count();

            TreeNode tn = new TreeNode(nums[nums.Length / 2]);

            Console.WriteLine(tn.val);

            tn.left = SortedArrayToBST(nums.Take(length / 2).ToArray());
            tn.right = SortedArrayToBST(nums.Skip(length / 2 + 1).Take(length - (length / 2 + 1)).ToArray());

            return tn;
        }
        
        public class TreeNode
        {
            public int val;
            public TreeNode left;
            public TreeNode right;
            public TreeNode(int val = 0, TreeNode left = null, TreeNode right = null)
            {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
    }
}
