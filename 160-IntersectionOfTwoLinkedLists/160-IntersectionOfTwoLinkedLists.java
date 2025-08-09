// Last updated: 8/9/2025, 1:44:52 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //First Method
        // ListNode tempa = headA;
        // while(tempa!=null){
        //     ListNode tempb = headB;
        //     while(tempb != null){
        //         if(tempa == tempb){
        //             return tempa;
        //         }
        //         tempb =tempb.next;
        //     }
        //     tempa =tempa.next;
        // }
        // return null;

        

        //secong method
        ListNode pcr =headA;
        ListNode vgf = headB;
        while(pcr!=vgf){
            if(pcr==null){
                pcr = headB;
            }else{
                pcr = pcr.next;
            }
            if(vgf==null){
                vgf = headA;
            }else{
                vgf = vgf.next;
            }
        }
        return pcr;

    }
}