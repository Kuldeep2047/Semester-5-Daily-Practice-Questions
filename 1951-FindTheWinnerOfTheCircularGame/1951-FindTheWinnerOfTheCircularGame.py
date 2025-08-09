# Last updated: 8/9/2025, 1:39:42 PM
class Solution(object):
    def findTheWinner(self, n, k):
        l= list(range(1, n + 1))
        start=0
        while len(l) > 1:
            remove= (start+k-1) % len(l)
            l.pop(remove)

            start=remove

        return l[0]
        