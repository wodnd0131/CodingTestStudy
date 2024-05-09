import java.util.HashMap;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> h1 = new HashMap<String, Integer>();
        int[][] reporting = new int[id_list.length][id_list.length];
        int[] reportedPoint = new int[id_list.length];
        for(int i=0;i<id_list.length;i++){
            h1.put(id_list[i],i);
        }
        
        for(String r : report){
            String[] reportWho = r.split(" ");
            reporting[h1.get(reportWho[0])][h1.get(reportWho[1])]=1 ;// 신고 등록 테이블
        }
        
        for(int i = 0; i<id_list.length;i++){ // reporting 서칭 포문 [신고자][피신고자]
            for(int j = 0; j<id_list.length;j++){
                if(i==j) continue;
                reportedPoint[j]+=reporting[i][j]; //신고 받은 횟수
            }
        }
        for(int i = 0; i<id_list.length;i++){
            for(int j = 0; j<id_list.length;j++){
                if(reportedPoint[j]>=k) answer[i]+=reporting[i][j];
            }
        }
        
        
        return answer;
    }
}