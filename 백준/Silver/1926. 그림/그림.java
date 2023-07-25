import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		//[그림의 개수, 가장 넓은 그림의 넓이]
		int[] answer= new int[2];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		
		int[][] paper = new int[n][m];
		
		//도화지 초기화
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				paper[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		//BFS
		boolean[][] isVisit = new boolean[n][m];
		
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		
		Queue<Loc> q = new LinkedList<>();
		
		//모든 그림을 확인
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				//그림이 그려져 있고 && 아직 방문 전이면 queue에 offer
				if(paper[i][j]==1 && !isVisit[i][j]) {
					//System.out.println("start: ("+i+","+j+")");
					isVisit[i][j]=true;
					q.offer(new Loc(i,j));
					answer[0]++;
				}
				//그림 탐색
				int paint=0;
				while(!q.isEmpty()) {
					
					Loc now = q.poll();
					paint++;
					
					//4방향 확인
					for(int d=0; d<4; d++) {
						int nextX = now.x+dx[d];
						int nextY = now.y+dy[d];
						
						if(nextX<0 || nextY<0 || nextX>=n || nextY>=m)	continue;
						if(isVisit[nextX][nextY])	continue;
						if(paper[nextX][nextY]==0)	continue;
						
						isVisit[nextX][nextY]= true;
						q.offer(new Loc(nextX, nextY));
					}
				}
				//System.out.println(paint);
				answer[1] = (paint > answer[1])? paint: answer[1];
			}
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
}

class Loc {
	int x;
	int y;
	
	Loc(int x, int y){
		this.x = x;
		this.y = y;
	}
}
