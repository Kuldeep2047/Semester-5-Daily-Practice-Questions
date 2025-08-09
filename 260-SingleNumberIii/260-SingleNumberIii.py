# Last updated: 8/9/2025, 1:44:09 PM
class Solution(object):
    def singleNumber(self, nums):
        
        l=[]
        for i in nums:
            if nums.count(i)==1:
                l.append(i)
                if len(l)==2:
                    return l
        