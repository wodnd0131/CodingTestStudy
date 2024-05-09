class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        if(a==b&&a==c){
            return answer * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c);
        }else if(a!=b&&b!=c&&a!=c ){
            return answer;
        }
        return answer * (a*a + b*b + c*c);
    }
}