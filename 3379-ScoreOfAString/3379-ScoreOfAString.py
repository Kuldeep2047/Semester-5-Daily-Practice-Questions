# Last updated: 8/9/2025, 1:37:23 PM
class Solution(object):
    def scoreOfString(self, s):
        total=0
        for i in range(len(s)-1):
            a=abs(ord(s[i])-ord(s[i+1]))
            total+=a
        return total
        