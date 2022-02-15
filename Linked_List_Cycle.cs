using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    public class Linked_List_Cycle
    {
        static void Main(string[] args)
        {
            ListNode head = new ListNode(3);
            //head.next = new ListNode(2);
            //head.next.next = new ListNode(0);
            //head.next.next.next = new ListNode(-4);
            //head.next.next.next = head.next;
            bool s = HasCycle(head);
            Console.WriteLine(s);
            Console.Read();

        }

        public static bool HasCycle(ListNode head)
        {
            var slow = head;
            var fast = head?.next;

            if (fast == null)
                return false;

            while (slow != fast)
            {
                if (fast?.next == null)
                {
                    return false;
                }

                slow = slow.next;
                fast = fast?.next?.next;
            }
            return true;
        }
    }

    public class ListNode
    {
        public int val;
        public ListNode next;
        public ListNode(int x)
        {
            val = x;
            next = null;
        }
    }
}
