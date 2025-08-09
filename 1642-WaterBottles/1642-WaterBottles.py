# Last updated: 8/9/2025, 1:40:19 PM
class Solution(object):
    def numWaterBottles(self, numBottles, numExchange):
        cb=0
        while numBottles>=numExchange:
            cb+=numExchange
            numBottles-=numExchange
            numBottles+=1
        return cb+numBottles
        