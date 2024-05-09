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
                ret+= i%2==mode ? charArr[i]:"";
            }
        }
        return ret.equals("") ? "EMPTY" : ret;
    }
}