# Last updated: 8/9/2025, 1:42:26 PM
class Solution(object):
    def toLowerCase(self, s):
        for i in s:
            if i.isupper():
                s=s.replace(i,i.lower())
        return s
        