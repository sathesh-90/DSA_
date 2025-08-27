from collections import Counter

class Solution(object):
    def majorityElement(self, nums):
        """
        LeetCode 169: Majority Element
        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times.
        It is guaranteed to exist.

        Approach: Use Counter to count frequencies and return the element
        with the maximum count.
        """
        freq = Counter(nums)                    # Count frequencies of elements
        return max(freq.keys(), key=freq.get)   # Return element with highest frequency

        # OR one-liner:
        # return Counter(nums).most_common(1)[0][0]
