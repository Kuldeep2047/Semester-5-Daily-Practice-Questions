# Last updated: 8/9/2025, 1:38:39 PM
class Solution(object):
    def maximumImportance(self, n, roads):
        d=[0]*n
        for edge in roads:
            d[edge[0]]+=1
            d[edge[1]]+=1
        d.sort()
        a=1
        t=0
        for i in d:
            t=t+a*i
            a+=1
        return t
        