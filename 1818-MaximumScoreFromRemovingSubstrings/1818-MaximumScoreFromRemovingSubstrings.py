# Last updated: 8/9/2025, 1:39:57 PM
class Solution(object):
    def maximumGain(self, s, x, y):
        if x<y:
            s=s[::-1]
            x,y=y,x
        def remove(s,a,b,p):
            stack=[]
            tp=0
            for i in s:
                if stack and stack[-1]==a and i==b:
                    stack.pop()
                    tp+=p
                else:
                    stack.append(i)
            return "".join(stack),tp

        s,point_ab =remove(s,"a","b",x)
        s,point_ba =remove(s,"b","a",y)
        return point_ab+point_ba
            