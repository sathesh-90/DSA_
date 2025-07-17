from collections import defaultdict

class Solution(object):
    def groupAnagrams(self, strs):
        anag_map = defaultdict(list)

        for word in strs:
            key = ''.join(sorted(word))  # sort characters to form the key
            anag_map[key].append(word)

        return list(anag_map.values()) 

s = Solution()
print(s. groupAnagrams(["tea","aet","gh","hg","reddy"]))

