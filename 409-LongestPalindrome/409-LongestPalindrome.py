# Last updated: 8/9/2025, 1:43:26 PM
class Solution(object):
    def longestPalindrome(self, s):
        from collections import Counter
        
        freq = Counter(s)
        length = 0
        odd_found = False
        
        for count in freq.values():
            length += count // 2 * 2
            if count % 2 == 1:
                odd_found = True
        
        if odd_found:
            length += 1
        
        return length
                