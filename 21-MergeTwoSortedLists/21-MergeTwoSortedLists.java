// Last updated: 10/30/2025, 8:55:17 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1,list2);
    }
    public static ListNode merge(ListNode one,ListNode two){
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while(one != null && two != null){
            if(one.val<two.val){
                dummy.next = one;
                dummy = dummy.next;
                one = one.next;
            }else{
                dummy.next = two;
                two = two.next;
                dummy = dummy.next;
            }
        }
        while(one != null){
            dummy.next = one;
            one = one.next;
            dummy = dummy.next;
        }
        while(two != null){
            dummy.next = two;
            two = two.next;
            dummy = dummy.next;
        }
        return head.next;
    }
}