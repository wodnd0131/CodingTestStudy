class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for(int j=0;j<num_list.length;j++){
            answer[j]=num_list[j];
        }
        int before = num_list[num_list.length-2];
        int last =num_list[num_list.length-1];

        answer[num_list.length] = last > before ?
            last-before:last*2;
        
        return answer;
    }
}