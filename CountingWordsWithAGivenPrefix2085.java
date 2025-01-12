class Solution {
    public static int prefixCount(String[] words, String pref) {

        int count = 0;

        for(String word: words){
            if (word.startsWith(pref)){
                count++;
            }
        }
        return count;      
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "app", "appreciate", "appreciation"};
        String pref = "app";

        int ans = prefixCount(words, pref);
        System.out.println(ans);
        
    }
}