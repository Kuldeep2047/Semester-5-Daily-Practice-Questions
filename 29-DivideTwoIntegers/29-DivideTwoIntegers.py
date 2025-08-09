# Last updated: 8/9/2025, 1:46:30 PM
class Solution(object):
    
    def divide(self, dividend, divisor):
        if dividend== -2147483648 and divisor== -1:
            return int("2147483647")
        elif (dividend>0 and divisor>0) or (dividend<0 and divisor<0):
            return (abs(dividend)//abs(divisor))
        else:
            return -1*(abs(dividend)//abs(divisor))