class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int temp=0;
        for(int i: numLog){
            switch(temp-i){
                case -1:
                    answer+="w";
                    break;
                case 1:
                    answer+="s";
                    break;
                case -10:
                    answer+="d";
                    break;
                case 10:
                    answer+="a";
                    break;
                default:
                    break;
            }
            temp=i;
        }
        return answer;
    }
}