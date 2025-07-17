class Solution(object):
    def hammingWeight(self, n):
        binary_str = bin(n)[2:]  
        count = 0
        for i in binary_str:
            if i == "1":
                count += 1
        return count

s = Solution()
print(s.hammingWeight(11))  
