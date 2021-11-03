package LeetCode;

public class Remove_Duplicates_from_Sorted_List {

	public static void main(String[] args) {
		ListNode l1_1= new ListNode(1);
		ListNode l1_2 = new ListNode(1);
		l1_1.next=l1_2;
		ListNode l1_3 = new ListNode(2);
		l1_2.next=l1_3;
		ListNode l1_4 = new ListNode(3);
		l1_3.next=l1_4;
		ListNode l1_5 = new ListNode(3);
		l1_4.next=l1_5;
		ListNode l2 = new ListNode();
		l2 = deleteDuplicates(l1_1);
		while(l2 !=null) {
			System.out.println(l2.val);
			l2=l2.next;
		}
	}

    public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null || head.next == null) return head;
    	ListNode cur = head;
    	while(cur.next !=null) {
    		if(cur.val == cur.next.val) {
    			cur.next = cur.next.next;
    		}else {
    			cur = cur.next;
    		}
    	}
    	return head;
    }
    
     public static class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode() {}
    	      ListNode(int val) { this.val = val; }
    	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    	  }
}
