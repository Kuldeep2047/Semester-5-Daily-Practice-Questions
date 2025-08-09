// Last updated: 8/9/2025, 1:41:21 PM
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
    public ListNode removeZeroSumSublists(ListNode head) {
        return answer(head);
    }
    public static ListNode answer(ListNode head){
        List<Integer> ll = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ll.add(temp.val);
            temp = temp.next;
        }
        
        boolean changed = true;
        
        while(changed){
            int n = ll.size();
            changed = false;
            for(int i=0;i<n;i++){
                int sum =0;
                for(int j=i;j<n;j++){
                    sum += ll.get(j);
                    if(sum ==0){
                        for(int k = j ;k>=i;k--){
                            ll.remove(i);
                        }
                        changed = true;
                        break;
                    }
                }
                if(changed){
                    break;
                }
            }
        }

        // head = null;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int val : ll){
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;


    }
}