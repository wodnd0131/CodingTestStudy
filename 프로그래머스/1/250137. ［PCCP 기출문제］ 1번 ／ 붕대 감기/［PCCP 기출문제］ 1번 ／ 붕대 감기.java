import java.util.ArrayList;
import java.util.List;

// 풀이 50분
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int heal = 0;
        boolean isAttacked = false;
        int max= health;
        for(int[] attack : attacks){
            if(isAttacked){
                heal=attack[0]-heal-1;
                health += bandage[1]*heal;
                    
                health += heal>=bandage[0] ? 
                    heal/bandage[0]*bandage[2]:0;
                
                health = health>max? max : health;
            }
            health-=attack[1];
            if(health<1){return -1;}
            heal=attack[0];
            isAttacked =true;
        }
        
        return health;
    }
}