from collections import Counter

class Solution(object):
    def canConstruct(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: bool
        """

        l = len(s)

        if l == k:
            return True

        if l < k:
            return False

        freq = Counter(s)

        odd = sum(1 for count in freq.values() if count % 2 == 1)

        return odd <= k