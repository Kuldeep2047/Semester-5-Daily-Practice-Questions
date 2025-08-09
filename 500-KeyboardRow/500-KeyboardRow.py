# Last updated: 8/9/2025, 1:43:07 PM
class Solution(object):
    def findWords(self, words):
        word=[]
        first='qwertyuiop'
        second='asdfghjkl'
        third='zxcvbnm'
        for element in words:
            l=len(element)
            c1=0
            c2=0
            c3=0
            for i in element.lower():
                if i in first:
                    c1+=1
                elif i in second:
                    c2+=1
                else:
                    c3+=1
            if c1==l or c2==l or c3==l:
                word.append(element)
        return word
        