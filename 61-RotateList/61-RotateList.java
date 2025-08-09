// Last updated: 8/9/2025, 1:45:54 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int len  = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        k = k%len;
        temp.next = head;  //make circular

        ListNode newtail =head;
        // ListNode prev = null;
        int diff = len-k;
        while(diff-- >1){
            newtail = newtail.next; 
        }
        head = newtail.next;
        newtail.next = null;
        return head;
        
    }
    
}