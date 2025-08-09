# Last updated: 8/9/2025, 1:46:54 PM
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        l=nums1+nums2
        l.sort()
        a=len(l)
        if len(l)%2!=0:
            return l[(a//2)]
        else:
            r=l[(a//2)-1]+l[(a//2)]
            return r/2.0