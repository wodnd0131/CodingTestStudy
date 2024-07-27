import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> dict = new HashMap<>();
        for(String[] s : clothes) dict.put(s[1],dict.getOrDefault(s[1],0)+1);
        int answer = 1;
        if(dict.values().size()==1) return clothes.length;
        for(int i : dict.values()){
            answer*=(i+1);
        }
        
        return answer-1;
    }
}