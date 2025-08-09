# Last updated: 8/9/2025, 1:38:33 PM
class Solution(object):
    def removeStars(self, s):
        l1=list(s)
        l2=[]
        for i in l1:
            if i!="*":
                l2.append(i)
            else:
                l2.pop()
        return "".join(l2)
        