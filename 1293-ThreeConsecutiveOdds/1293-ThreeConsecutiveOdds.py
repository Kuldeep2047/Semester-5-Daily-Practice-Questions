# Last updated: 8/9/2025, 1:41:20 PM
class Solution(object):
    def threeConsecutiveOdds(self, arr):
        for i in range(len(arr) - 2):
            if arr[i] % 2 == 1 and arr[i+1] % 2 == 1 and arr[i+2] % 2 == 1:
                return True
        return False
        