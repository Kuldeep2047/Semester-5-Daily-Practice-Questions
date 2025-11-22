// Last updated: 11/22/2025, 12:03:16 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return answer(l1,l2);
    }

    public static ListNode answer(ListNode l1, ListNode l2){
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;

        while(temp1 != null || temp2 != null){
            int sum = carry;

            if(temp1 != null){
                sum += temp1.val;
            }
            if(temp2 != null){
                sum += temp2.val;
            }

            carry = sum /10;

            ListNode nn = new ListNode(sum %10);

            curr.next = nn;
            curr = curr.next;

            if(temp1 != null){
                temp1 = temp1.next;
            }
            if(temp2 != null){
                temp2 = temp2.next;
            }

        }
        if(carry >0){
            ListNode nn = new ListNode(carry);
            curr.next = nn;
        }

        return ans.next;
    }


}




















