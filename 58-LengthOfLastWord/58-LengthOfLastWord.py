# Last updated: 8/9/2025, 1:45:58 PM
class Solution(object):
    def lengthOfLastWord(self, s):
        l=s.split()
        last=l[-1]
        if " "  not in last:
            return len(last)
        else:
            return(len(l[-2]))
        