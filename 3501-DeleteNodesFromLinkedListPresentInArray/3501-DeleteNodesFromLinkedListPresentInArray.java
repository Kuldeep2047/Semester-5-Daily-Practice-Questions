// Last updated: 8/9/2025, 1:37:10 PM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        return answer(nums,head);
    }
    public static ListNode answer(int[] nums,ListNode head){
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        
        while(head!=null && set.contains(head.val)){
            head = head.next;
        }
        ListNode temp = head;
        while(temp != null && temp.next!= null){
            int n = temp.next.val;
            if(set.contains(n)){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}

