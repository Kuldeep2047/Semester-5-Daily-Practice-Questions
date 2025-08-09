# Last updated: 8/9/2025, 1:39:37 PM
class Solution(object):
    def findCenter(self, edges):
        from collections import defaultdict
        d=defaultdict(int)
        for edge in edges:
            d[edge[0]]+=1
            d[edge[1]]+=1
        for i,j in d.items():
            if j==len(edges):
                return i
        