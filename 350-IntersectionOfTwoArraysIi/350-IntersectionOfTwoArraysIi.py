# Last updated: 8/9/2025, 1:43:49 PM
class Solution(object):
    def intersect(self, nums1, nums2):
        common=[]
        for i in nums1:
            if i in nums2:
                common.append(i)
                nums2.remove(i)
        return common
        