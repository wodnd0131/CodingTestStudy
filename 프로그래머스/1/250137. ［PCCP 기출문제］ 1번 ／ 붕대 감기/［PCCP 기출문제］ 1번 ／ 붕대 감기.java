import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int heal = 0;
        boolean isAttacked = false;
        int answer= health;
        for(int[] attack : attacks){
            if(isAttacked){
                heal=attack[0]-heal-1;
                answer += heal>=bandage[0]? 
                    bandage[1]*heal+(int)(heal/bandage[0])*bandage[2]:
                    bandage[1]*heal;
                answer = answer>health? health : answer;
            }
            answer-=attack[1];
            if(answer<1){return -1;}
            heal=attack[0];
            isAttacked =true;
        }
        
        return answer;
    }
}