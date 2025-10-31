// Last updated: 10/31/2025, 2:52:05 PM
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
        return answer(list1, list2);
    }
    public static ListNode answer(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode head = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                dummy.next = temp1;
                dummy = dummy.next;
                temp1 = temp1.next;
            }else{
                dummy.next = temp2;
                dummy = dummy.next;
                temp2 = temp2.next;
            }
        }

        while(temp1 != null){
            dummy.next = temp1;
            dummy = dummy.next;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            dummy.next = temp2;
            dummy = dummy.next;
            temp2 = temp2.next;
        }

        return head.next;
    }
}