import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        String hol="";
        String jac="";
        for(int num :num_list){
            if (num%2==0){
                jac+=""+num;
            }else{ hol+=""+num ;}
        }
        return Integer.parseInt(hol)+Integer.parseInt(jac);
    }
}