
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		//System.out.println(N+" "+M);
		//미로 초기화
		int[][] maze = new int[N][M];
		for(int i=0; i<N; i++) {
			char[] mazeLine = br.readLine().toCharArray();
			for(int j=0; j<M; j++) {
				maze[i][j] = (int)mazeLine[j]-48;
			}
		}
		
		int[] dx= {1, 0, -1, 0};
		int[] dy= {0, 1, 0, -1};
		
		boolean[][] visit = new boolean[N][M];
		Queue<Dot> q= new LinkedList<Dot>();
		int answer=Integer.MAX_VALUE;
		//시작위치 지정
		q.offer(new Dot(0, 0, 0));
		visit[0][0] = true;
		while(!q.isEmpty()) {
			Dot curr = q.poll();
			//System.out.println("("+curr.x+", "+curr.y+"): "+curr.count);
			if(curr.x==N-1 && curr.y==M-1) {
				//System.out.println(answer +" "+curr.count);
				if(answer > curr.count) answer= curr.count; 
				visit[N-1][M-1]= false;
				continue;
			}
			for(int i=0; i<4; i++) {
				int nextX = curr.x+dx[i];
				int nextY = curr.y+dy[i];
				if(nextX <0 || nextX>= N || nextY <0 || nextY >=M) continue;
				if(maze[nextX][nextY]==1 && visit[nextX][nextY]==false) {
					q.offer(new Dot(nextX, nextY, curr.count));
					visit[nextX][nextY]= true;
				}
			}
		}
		
		System.out.println(answer);
		
		
	}

}
class Dot{
	int x;
	int y;
	int count;
	
	Dot(int x, int y, int c) {
		this.x= x;
		this.y= y;
		this.count= c+1;
	}
}
