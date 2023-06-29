import java.util.*;
class Solution {
    
    int[][] dg;
    boolean[] visit;
    int answer;
    
    public void explore(int curr, int k){
        
       //System.out.println(curr+" "+k);
        
        if(k<=0 || curr==dg.length){
            if(answer < curr) answer=curr;
            //System.out.println("answer: "+answer);
            return;
        }
        
        for(int i=0; i<dg.length; i++){
            if(visit[i]==true) continue;
            if(dg[i][0]>k) continue;
            visit[i]=true;
            explore(curr+1, k-dg[i][1]);
            visit[i]=false;
        }
        
        if(answer < curr) answer=curr;
    }
    
    public int solution(int k, int[][] dungeons) {
        
        
        //전역변수 초기화
        dg= dungeons;
        visit= new boolean[dungeons.length];
        answer= 0;
        
        explore(0, k);
        
        return answer;
    }
}