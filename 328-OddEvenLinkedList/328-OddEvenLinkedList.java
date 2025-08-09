// Last updated: 8/9/2025, 1:43:59 PM
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
    public ListNode oddEvenList(ListNode head) {
        return answer(head);
    }
    public static ListNode answer(ListNode head){
        int len =0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len<3){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode join = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;      //next odd

            even.next = odd.next;
            even = even.next;    //next even
        }
        odd.next = join;
        return head;
        
    }
}