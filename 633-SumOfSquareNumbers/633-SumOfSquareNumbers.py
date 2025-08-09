# Last updated: 8/9/2025, 1:42:40 PM
import math
class Solution(object):
    def judgeSquareSum(self, c):
        
        st = int(math.sqrt(c))
        for i in range(st, -1, -1):
            if math.sqrt(c - (i ** 2)) % 1 == 0:
                return True
        return False
        