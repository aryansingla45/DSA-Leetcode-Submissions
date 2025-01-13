# You are given a string s.

# You can perform the following process on s any number of times:

# Choose an index i in the string such that there is at least one character to the left of index i that is equal to s[i], and at least one character to the right that is also equal to s[i].
# Delete the closest character to the left of index i that is equal to s[i].
# Delete the closest character to the right of index i that is equal to s[i].
# Return the minimum length of the final string s that you can achieve.

from collections import Counter

class Solution(object):
    def minimumLength(self, s):
        """
        :type s: str
        :rtype: int
        """

        map = Counter(s)

        count = 0

        for val in map.values():
            if val < 3:
                count += val
            else:
                while val >= 3:
                    val -= 2
                count += val

        return count
    
def main():
    s = "abababababaaa"
    print(Solution.minimumLength(Solution() , s))


if __name__ == "__main__":
    main()


        