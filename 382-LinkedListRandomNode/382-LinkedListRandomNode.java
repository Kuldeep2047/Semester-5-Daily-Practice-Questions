// Last updated: 8/9/2025, 1:43:38 PM
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
    List<Integer> ll = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp =head;
        while(temp != null){
            ll.add(temp.val);
            temp = temp.next;
        }
        
    }
    
    public int getRandom() {
        double idx = Math.random()* ll.size();
        return ll.get((int) idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */