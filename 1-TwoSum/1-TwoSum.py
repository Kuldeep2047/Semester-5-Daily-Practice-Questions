# Last updated: 8/9/2025, 1:46:57 PM
class Solution:
    def twoSum(self,nums,target):
        index=[]
        for i in range(len(nums)):
            s=0
            for j in range(i+1,len(nums)):
                s=nums[i]+nums[j]
                if s==target:
                    index.append(i)
                    index.append(j)
        return index

