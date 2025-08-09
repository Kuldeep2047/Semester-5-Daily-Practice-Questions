# Last updated: 8/9/2025, 1:41:37 PM
from collections import Counter
class Solution(object):
    def commonChars(self, words):
        a=words[0]
        b=Counter(a)

        for word in words:
            c=Counter(word)
            b &=c
        dict(b)
        l=[]
        for i,j in b.items():
            l.extend([i]*j)
        return l

        
        