class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int temp = 0;
        for(boolean b : included){
            if(b){
                answer+=a+d*temp;
            }
            temp++;
        }
        
        return answer;
    }
}