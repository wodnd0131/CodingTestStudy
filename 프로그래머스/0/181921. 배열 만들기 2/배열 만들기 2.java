import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for(int i=l;i<=r;i++){
            String str = i+"";
            for (char c : str.toCharArray()){
                if(!(c=='5' || c=='0')){
                    str="-1";
                    break;
                }
            }
            if(!str.equals("-1")){
                answer.add(i);
            }
        }
        int[] empty = {-1};
        return answer.isEmpty()?empty:answer.stream().mapToInt(i->i).toArray();
    }
}