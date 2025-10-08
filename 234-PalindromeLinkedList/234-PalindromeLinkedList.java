// Last updated: 10/8/2025, 10:15:35 AM
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
    public boolean isPalindrome(ListNode head) {
        return is_Palindrome(head);
    }
    public static boolean is_Palindrome(ListNode head){
        List<Integer> ll = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ll.add(temp.val);
            temp = temp.next;
        }
        int i=0;
        int j = ll.size()-1;
        while(i<j){
            if(ll.get(i) != ll.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}