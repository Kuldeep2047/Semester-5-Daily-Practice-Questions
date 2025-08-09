# Last updated: 8/9/2025, 1:38:16 PM
class Solution(object):
    def appendCharacters(self, s, t):
        i, j = 0, 0
        while i < len(s) and j < len(t):
            if s[i] == t[j]:
                j += 1
            i += 1
        if j == len(t):
            return 0
        return len(t) - j
        