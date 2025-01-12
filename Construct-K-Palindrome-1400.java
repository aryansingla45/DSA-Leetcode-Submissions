import java.util.HashMap;

class Solution {
    public boolean canConstruct(String s, int k) {

        int len = s.length();
        if(len == k) return true;
        if(len < k) return false;

        HashMap<Character , Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0) + 1);
        }

        int odd = 0 ;

        for(int val: map.values()){
            if(val % 2 != 0){
                odd++;
            }
        }

        if(odd > k){
            return false;
        }

        return true; 
    }
}