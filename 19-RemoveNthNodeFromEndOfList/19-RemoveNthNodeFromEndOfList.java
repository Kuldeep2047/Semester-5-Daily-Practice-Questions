// Last updated: 8/9/2025, 1:46:38 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int len =0;
        ListNode temp =head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(n == len){
            return head.next;
        }
        int idx = len-n;
        temp = head;
        int c =1;
        // ListNode prev =null;
        while(c<idx){
            c++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

        
        
    }
}