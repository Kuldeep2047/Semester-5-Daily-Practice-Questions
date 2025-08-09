# Last updated: 8/9/2025, 1:41:07 PM
class Solution(object):
    def numberOfSubarrays(self, nums, k):
        count = {0: 1}
        current_odd_count = 0
        result = 0
        
        for num in nums:
            if num % 2 == 1:
                current_odd_count += 1
            
            if current_odd_count - k in count:
                result += count[current_odd_count - k]
            
            if current_odd_count in count:
                count[current_odd_count] += 1
            else:
                count[current_odd_count] = 1
        
        return result
        