# Last updated: 8/9/2025, 1:46:49 PM
class Solution(object):
    def longestPalindrome(self, s):
        def expand_around_center(s, left, right):
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            return s[left + 1:right]

        if len(s) <= 1:
            return s

        longest = ""
        for i in range(len(s)):
            # Odd length palindrome
            odd_palindrome = expand_around_center(s, i, i)
            if len(odd_palindrome) > len(longest):
                longest = odd_palindrome
            
            # Even length palindrome
            even_palindrome = expand_around_center(s, i, i + 1)
            if len(even_palindrome) > len(longest):
                longest = even_palindrome

        return longest
        