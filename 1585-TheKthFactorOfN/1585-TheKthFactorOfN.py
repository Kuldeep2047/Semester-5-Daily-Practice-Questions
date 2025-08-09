# Last updated: 8/9/2025, 1:40:27 PM
class Solution(object):
    def kthFactor(self, n, k):
        factor=[]
        for i in range(1,n+1):
            if n%i==0:
                factor.append(i)
                if len(factor)==k:
                    return factor[k-1]
        return -1
        