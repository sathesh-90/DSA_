class Solution(object):
    def canPartition(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        total = sum(nums)
        
        # If total is odd, can't be partitioned into two equal subsets
        if total % 2 != 0:
            return False
        
        target = total // 2
        dp = [False] * (target + 1)
        dp[0] = True  # base case: sum 0 is always possible
        
        for num in nums:
            for i in range(target, num - 1, -1):  # Go backwards to avoid using the same number twice
                dp[i] = dp[i] or dp[i - num]
        
        return dp[target]
