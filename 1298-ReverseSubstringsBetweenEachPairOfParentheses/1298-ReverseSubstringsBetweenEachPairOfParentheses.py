# Last updated: 8/9/2025, 1:41:17 PM
class Solution(object):
    def reverseParentheses(self, s):
        stack=[]
        for char in s:
            if char==")":
                t=[]
                while stack and stack[-1]!="(":
                    t.append(stack.pop())
                if stack:
                    stack.pop()
                stack.extend(t)
            else:
                stack.append(char)
        
        return ''.join(stack)