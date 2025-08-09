# Last updated: 8/9/2025, 1:45:05 PM
class Solution(object):
    def reverseWords(self, s):
        
        l=s.split()
      
        return " ".join(l[::-1])