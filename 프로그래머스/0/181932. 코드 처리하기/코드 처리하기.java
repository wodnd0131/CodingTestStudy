class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        String ret = "";
        char[] charArr = code.toCharArray();
        
        for(int i=0; i<charArr.length;i++){
            if(charArr[i]=='1'){
                mode= mode==1? 0:1;
            }else{
                ret+= mode==0&&i%2==0 ? charArr[i]:"";
                ret+= mode==1&&i%2!=0 ? charArr[i]:"";
            }
        }
        
        for(char a:ret.toCharArray()){
            char temp = ' ';
            if(temp!=a){
                answer+=a;
                temp=a;
            }
            
        }
        if(answer.equals("")){
            return "EMPTY";
        }
        return answer;
    }
}