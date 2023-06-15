import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] paper = new int[n][m];
		
		//도화지 초기화
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//BFS 시작
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		Queue<Dot> queue = new LinkedList<>();
		boolean[][] isVisit = new boolean[n][m];
		int max=0;
		int count=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				int paint=0;
				//방문하지 않았고, 색칠되어있으면 queue에 offer
				if(isVisit[i][j] == false && paper[i][j]==1) {
					//System.out.println(i+" "+j);
					//방문표시 & 큐에 넣음
					isVisit[i][j]=true;
					queue.offer(new Dot(i, j));
					paint += 1;
					count++;
				}
				
				//근처 노드 모두 확인
				while(!queue.isEmpty()) {
					Dot curr = queue.poll();
					//System.out.println("Out "+curr.x+" "+curr.y);
					for(int d=0; d<4; d++) {
						int nx = curr.x+dx[d];
						int ny = curr.y+dy[d];
						if(nx<0 || nx>= n || ny <0 || ny>=m) continue;
						if(isVisit[nx][ny]==true) continue;
						//색칠된 부분 queue에 넣기
						if(isVisit[nx][ny] == false && paper[nx][ny]==1) {
							//System.out.println("in "+nx+" "+ny);
							isVisit[nx][ny] = true;
							queue.offer(new Dot(nx, ny));
							paint += 1;
						}
						
						
					}
				}
				//max값 갱신
				if(max<paint) max=paint;
				
			}
		}
		System.out.println(count);
		System.out.println(max);
		
		
	}

}
class Dot{
	int x;
	int y;
	
	Dot(int x, int y) {
		this.x= x;
		this.y= y;
	}
}