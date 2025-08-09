# Last updated: 8/9/2025, 1:39:53 PM
class Solution(object):
    def decode(self, encoded, first):
        n=len(encoded)+1
        l=[0]*n
        l[0]=first
        for i in range(1,n):
            l[i]=encoded[i-1]^l[i-1]
        return l
        