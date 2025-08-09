# Last updated: 8/9/2025, 1:38:04 PM
class Solution(object):
    def passThePillow(self, n, time):
        stand, f = 1, 1
        while time:
            time -= 1
            if f:
                stand += 1
                if stand == n:
                    f = not f
            else:
                stand -= 1
                if stand == 1:
                    f = not f
        return stand
        