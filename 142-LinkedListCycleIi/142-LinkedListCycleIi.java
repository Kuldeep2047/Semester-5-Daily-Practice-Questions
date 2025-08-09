// Last updated: 8/9/2025, 1:45:08 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        return answer(head);
    }

    public static ListNode answer(ListNode head){
        ListNode meet = isCycle(head);
        if(meet==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = meet;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
                        
        }
        return slow;
    }

    public static ListNode isCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
}