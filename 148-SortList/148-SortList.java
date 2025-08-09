// Last updated: 8/9/2025, 1:45:02 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = midNode(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        ListNode one = sortList(left);
        ListNode two = sortList(right);
        return merge(one,two);

    }
    public static ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public static ListNode merge(ListNode a,ListNode b){
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while(a != null && b != null){
            if(a.val < b.val){
                dummy.next = a;
                a = a.next;
                dummy = dummy.next;
            }else{
                dummy.next = b;
                b = b.next;
                dummy = dummy.next;
            }
        }
        while(a != null){
            dummy.next = a;
            a = a.next;
            dummy = dummy.next;
        }
        while(b != null){
            dummy.next = b;
            b = b.next;
            dummy = dummy.next;
        }
        return head.next;



    }
}