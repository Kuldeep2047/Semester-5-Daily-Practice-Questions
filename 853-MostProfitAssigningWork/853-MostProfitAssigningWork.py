# Last updated: 8/9/2025, 1:42:12 PM
class Solution(object):
    def maxProfitAssignment(self, difficulty, profit, worker):
        jobs = sorted(zip(difficulty, profit))
        # Sort workers by their abilities
        worker.sort()

        max_profit = 0
        total_profit = 0
        i = 0
        n = len(jobs)

        for ability in worker:
            # Update the max_profit for the current ability
            while i < n and ability >= jobs[i][0]:
                max_profit = max(max_profit, jobs[i][1])
                i += 1
            # Add the max_profit that the current worker can get
            total_profit += max_profit
        
        return total_profit
        