# Last updated: 8/9/2025, 1:43:54 PM
class Solution(object):
    def reverseVowels(self, s):
        lst=list(s)
        r=len(lst)-1
        m="aeiouAEIOU"
        l=0
        while l<r:
            if lst[l] in m and lst[r] in m:
                lst[r],lst[l]=lst[l],lst[r]
                l+=1
                r=r-1
            elif lst[l] not in m:
                l+=1
            elif lst[r] not in m:
                r-=1
        return ''.join(lst)
        