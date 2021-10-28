package LeetCode;

public class Merge_Two_Sorted_Lists {

	public static void main(String[] args) {
		ListNode l1_1 = new ListNode(1);
		l1_1.next=null;
		ListNode l1_2 = new ListNode(2);
		l1_1.next = l1_2;
		ListNode l1_3 = new ListNode(4);
		l1_2.next = l1_3;
		ListNode l2_1 = new ListNode(1);
		l2_1.next=null;
		ListNode l2_2 = new ListNode(3);
		l2_1.next = l2_2;
		ListNode l2_3 = new ListNode(4);
		l2_2.next = l2_3;		
		ListNode l3 = new ListNode();
		l3 =mergeTwoLists(l1_1,l2_1);
		for(int i=0;i<=6;i++) {
			System.out.println(l3.val);
			l3=l3.next;
		}
	}

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    	
    }

	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
