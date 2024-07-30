import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers,target,0,numbers[0])+dfs(numbers,target,0,-numbers[0]);
    }
    
    private int dfs(int[] numbers, int target, int now, int total){
        if(now == numbers.length-1) return total == target? 1:0;
        now++;
        return dfs(numbers,target,now,total+numbers[now])+dfs(numbers,target,now,total-numbers[now]);
    }
}