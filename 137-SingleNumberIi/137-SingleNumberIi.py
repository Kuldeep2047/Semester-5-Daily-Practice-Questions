# Last updated: 8/9/2025, 1:45:10 PM
class Solution(object):
    def singleNumber(self, nums):
        for i in nums:
            if nums.count(i)==1:
                return i
        