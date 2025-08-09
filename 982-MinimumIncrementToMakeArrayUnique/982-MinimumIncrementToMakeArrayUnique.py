# Last updated: 8/9/2025, 1:41:49 PM
class Solution:

    def minIncrementForUnique(self, nums):

        nums.sort()

        moves = 0

        

        for i in range(1, len(nums)):

            if nums[i] <= nums[i - 1]:

                increment = nums[i - 1] - nums[i] + 1

                nums[i] += increment

                moves += increment

        

        return moves




