# Last updated: 8/9/2025, 1:38:48 PM
class Solution(object):
    def countEven(self, num):
        def even_check(n):
            st=str(n)
            s=0
            for j in st:
                s+=int(j)
            if s%2==0:
                return True
            else:
                return False

        c=0
        for i in range(1,num+1):
            if even_check(i):
                c+=1
        return c

                
        