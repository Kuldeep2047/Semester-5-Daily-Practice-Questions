# Last updated: 8/9/2025, 1:44:24 PM
class Solution(object):
    def isPowerOfTwo(self, n):
        for i in range(0,31):
            p=2**i
            if p==n:
                return True
        return False
        