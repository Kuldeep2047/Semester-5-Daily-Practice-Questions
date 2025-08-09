# Last updated: 8/9/2025, 1:46:47 PM
class Solution(object):
    def reverse(self, x):
        s= -1 if x<0 else 1
        n=abs(x)
        r=int(str(n)[::-1])
        rev=r*s
        if rev<-2**31 or rev>2**31-1:
            return 0
        else:
            return rev