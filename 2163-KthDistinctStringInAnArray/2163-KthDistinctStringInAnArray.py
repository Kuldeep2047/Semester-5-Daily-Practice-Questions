# Last updated: 8/9/2025, 1:39:14 PM
class Solution(object):
    def kthDistinct(self, arr, k):
        l=[]
        for i in arr:
            if arr.count(i)==1:
                l.append(i)
        if k>len(l):
            return ""
        else:
            return l[k-1]
        