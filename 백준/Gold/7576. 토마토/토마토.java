
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
	
   
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N= Integer.parseInt(st.nextToken());
    	int M= Integer.parseInt(st.nextToken());
    	int[][] box = new int[M][N];
    	
    	Queue<Tomato> q = new LinkedList<>();
    	int[] dx= {0, 0, 1, -1};
    	int[] dy= {1, -1, 0, 0};
    	
    	//box 초기화
    	for(int i=0; i<M; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0; j<N; j++) {
    			box[i][j] = Integer.parseInt(st.nextToken());
    			//익은 토마토 표시
    			if (box[i][j]==1) q.offer(new Tomato(i, j, 0));
    		}
    	}
    	
    	int maxDate=0;
    	//BFS
    	while(!q.isEmpty()) {
    		
    		Tomato now = q.poll();
    		
    		for(int i=0; i<4; i++) {
    			int nextX = now.x+dx[i];
    			int nextY = now.y+dy[i];
    			
    			if(nextX<0 || nextX>=M || nextY<0 || nextY>=N) continue;
    			if(box[nextX][nextY]==-1)continue;
    			if(box[nextX][nextY]==1)continue;
    			
    			box[nextX][nextY]= 1;
    			q.offer(new Tomato(nextX, nextY, now.day+1)); 
    		}
    		maxDate = (maxDate<now.day)? now.day: maxDate;
    	}
    	

    	//상자 확인
    	for(int i=0; i<M; i++) {
    		for(int j=0; j<N; j++) {
    			if(box[i][j]==0) {

    				System.out.println("-1");
    				return;
    			}
    		}
    	}
    	
    	System.out.println(maxDate);
    	
    }
}

class Tomato{
	
	int x;
	int y;
	int day;
	
	Tomato(int x, int y, int day){
		this.x= x;
		this.y= y;
		this.day=day;
	}
}
