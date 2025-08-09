# Last updated: 8/9/2025, 1:40:24 PM
class Solution(object):
    def minDifference(self, nums):
        if len(nums)<=4:
            return 0
        nums.sort()
        l=[]
        return min([nums[-1]-nums[3],nums[-4]-nums[0],nums[-2]-nums[2],nums[-3]-nums[1]])
        