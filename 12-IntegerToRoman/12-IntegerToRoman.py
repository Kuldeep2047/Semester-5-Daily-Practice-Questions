# Last updated: 8/9/2025, 1:46:46 PM
class Solution(object):
    def intToRoman(self, num):
        thousands = ["", "M", "MM", "MMM"]
        hundreds = ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"]
        tens = ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
        ones = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
        
       
        th = num // 1000
        h = (num % 1000) // 100
        t = (num % 100) // 10
        o = num % 10
        return thousands[th] + hundreds[h] + tens[t] + ones[o]
        