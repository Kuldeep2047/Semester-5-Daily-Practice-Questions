# Last updated: 8/9/2025, 1:40:30 PM
class Solution(object):
    def maxVowels(self, s, k):
        # l=[]
        # for i in range(len(s)):
        #     if s[i:i+k] and i<=len(s)-k:
        #         c=0
        #         for j in s[i:i+k]:
        #             if j in "aeiou":
        #                 c+=1
        #         l.append(c)
        # return max(l)
        vowel = "aeiou"
        mcount=count = sum(1 for i in range(k) if s[i] in vowel)

        for i in range(k,len(s)):
            count+=(s[i] in vowel)-(s[i-k] in vowel)
            mcount=max(mcount,count)
        return mcount