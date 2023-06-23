import java.util.*;
class Solution {
    
    boolean[] visit;
    int answer=0;
    
    public int solution(String begin, String target, String[] words) {
        
        //target이 없는 경우
        boolean exist= false;
        for(String s: words){
            if (target.equals(s)){
                exist=true; break;
            }
        }
        if(!exist) return 0;
        //target이 있는 경우
        visit= new boolean[words.length];
        bfs(begin, target, words, 0);
        return answer;
    }
    
    public void bfs(String now, String target, String[] words, int a){
        //System.out.println("-" + now+" "+a);
        if(now.equals(target)) {
            answer= a;
            return;
        }
        
        for(int j=0; j<words.length; j++){
            if(visit[j]==true) continue;
            int cnt=0;
            for(int i=0; i<now.length(); i++){
                if(now.charAt(i)!=words[j].charAt(i)) cnt++;
            }
            if(cnt==1) {
                visit[j]=true;
                bfs(words[j], target, words, a+1);
                //System.out.println("-r: " + now+" "+a);
                visit[j]=false;
            }
        }
    }
}
