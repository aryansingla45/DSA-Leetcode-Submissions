// You are given a string s.

// You can perform the following process on s any number of times:

// Choose an index i in the string such that there is at least one character to the left of index i that is equal to s[i], and at least one character to the right that is also equal to s[i].
// Delete the closest character to the left of index i that is equal to s[i].
// Delete the closest character to the right of index i that is equal to s[i].
// Return the minimum length of the final string s that you can achieve.



import java.util.HashMap;
import java.util.Map;

class MinimumLengthofStringAfterOperations3223 {

    public int minimumLength(String s) {

        Map<Character , Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        int count = 0;
        for(int val : map.values()){

            if(val < 3){
                count += val;
            }
            else{
                while(val >= 3){
                    val -= 2;
                }
                count += val;
            }
        }

        return count;
        
    }
    
}