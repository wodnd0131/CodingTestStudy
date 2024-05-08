import java.util.HashMap;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String,Integer> hash = new HashMap<>();
        int[][] table = new int[friends.length][friends.length];
        int[] point = new int[friends.length];
        
        for(int i=0;i<friends.length;i++){
            hash.put(friends[i],i);
        }
        
        for(String gift : gifts){
            String[] git = gift.split(" ");
            table[hash.get(git[0])][hash.get(git[1])]++;
            point[hash.get(git[0])]++;
            point[hash.get(git[1])]--;
        }
        
        for(int i=0;i<friends.length;i++){
            int temp =0;
            for(int j=0;j<friends.length;j++){
                if(i==j){continue;}
                if(table[i][j]>table[j][i] || 
                   (table[i][j]==table[j][i] &&
                                              point[i]>point[j])){
                    temp++;
                }
            }
            if (answer<temp){
                answer=temp;
            }
        }
        
        return answer;
    }

}