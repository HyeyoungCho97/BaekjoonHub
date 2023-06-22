import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visit = new boolean[computers.length];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<computers.length; i++){
            if(visit[i]==true) continue;
            //System.out.println(i);
            q.offer(i);
            visit[i]=true;
            answer++;
            while(!q.isEmpty()){
                int now= q.poll();
                for(int c=0; c<computers.length; c++){
                     if (visit[c]) continue;
                     if (computers[now][c]==0) continue;
                    q.offer(c);
                    visit[c]=true;
                    System.out.println(now+" "+c);
                    
                }
            }
        }
        return answer;
    }
}