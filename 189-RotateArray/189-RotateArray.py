# Last updated: 8/9/2025, 1:44:47 PM
class Solution(object):
    def rotate(self, nums, k):
        l=len(nums)
        k=k%l
        m=l-k
        temp=nums[0:m]
        nums[0:m]=[]
        nums.extend(temp)
            