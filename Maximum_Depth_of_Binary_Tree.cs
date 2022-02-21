using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Maximum_Depth_of_Binary_Tree
{
    class Program
    {
        static void Main(string[] args)
        {

            TreeNode tn = new TreeNode(3);
            TreeNode tn_2 = new TreeNode(9);
            TreeNode tn_3 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
            tn.left = tn_2;
            tn.right = tn_3;

            Console.Write(dep(tn));
            Console.Read();
        }


        public static int dep(TreeNode tn)
        {
            if (tn == null)
                return 0;

            int left = dep(tn.left);
            int right = dep(tn.right);

            return Math.Max(left, right) + 1;
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
