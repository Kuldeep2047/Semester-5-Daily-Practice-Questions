# Last updated: 8/9/2025, 1:40:11 PM
class Solution(object):
    def minOperations(self, logs):
        # count = 0
        # for folder in logs:
        #     if folder == "../":
        #         count = max(0,count-1)
        #     elif folder != "./":
        #         count +=1
        # return count

        l=[]
        for folder in logs:
            if folder == "../":
                if len(l)>=1:
                    l.pop()
            elif folder == "./":
                pass
            else:
                l.append(folder)
        return len(l)
        