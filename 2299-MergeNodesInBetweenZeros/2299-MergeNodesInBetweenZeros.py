# Last updated: 8/9/2025, 1:38:46 PM
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeNodes(self, head):
        dummy=ListNode()
        curr=dummy
        head=head.next
        Sum=0
        while head:
            if head.val==0:
                curr.next=ListNode(Sum)
                curr=curr.next
                Sum=0
            Sum+=head.val
            head = head.next
        return dummy.next
        
        