import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = Integer.MAX_VALUE;
        int n= maps.length;
        int m= maps[0].length;
        Queue<Loc> q= new LinkedList<>();
        boolean[][] visit= new boolean[n][m];
        //초기위치 입력
        q.offer(new Loc(0, 0, 1));
        visit[0][0]=true;
        //탐색 범위
        int[] dx={1, 0, -1, 0};
        int[] dy={0, 1, 0, -1};
        //BFS 진행
        while(!q.isEmpty()){
            //현재 위치
            Loc now = q.poll();
            //상대편을 만난경우
            if(now.x==n-1 && now.y==m-1){
                answer = (now.dist<answer)? now.dist :answer;
            }
            
            //다음위치 탐색
            for(int i=0; i<4; i++){
                int nx= now.x+dx[i];
                int ny= now.y+dy[i];
                int nt= now.dist+1;
                if(nx<0|| nx>=n|| ny<0|| ny>=m) continue;
                if(maps[nx][ny]==0)continue;
                if(visit[nx][ny]) continue;
                q.offer(new Loc(nx, ny, nt));
                visit[nx][ny]=true;
            }
        }

        return (answer==Integer.MAX_VALUE)? -1: answer;
    }
}

class Loc{
    int x;
    int y;
    int dist=0;
    Loc(int x, int y, int dist){
        this.x= x;
        this.y= y;
        this.dist= dist;
    }
}