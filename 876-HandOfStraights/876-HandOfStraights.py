# Last updated: 8/9/2025, 1:42:08 PM
class Solution(object):
    def isNStraightHand(self, hand, groupSize):
        c=collections.Counter(hand)
        n=sorted(c)
        for i in n:
            if c[i]>0:
                for j in range(groupSize)[::-1]:
                    c[i+j]-=c[i]
                    if c[i+j]<0:
                        return False
        return True        
        