import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] tempFreq = new int[26];
            for (char c : word.toCharArray()) {
                tempFreq[c - 'a']++;
                maxFreq[c - 'a'] = Math.max(maxFreq[c - 'a'], tempFreq[c - 'a']);
            }
        }
 
        List<String> result = new ArrayList<>();

        for (String word : words1) {
            int[] wordFreq = new int[26];
            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;
            }

            boolean f = true;
            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] < maxFreq[i]) {
                    f = false;
                    break;
                }
            }

            if (f) {
                result.add(word);
            }
        }

        return result;
    }
}
