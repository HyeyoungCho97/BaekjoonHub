import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int N;
	static int[][] map;
	static int[] dirX = {0, 0, -1, 1};
	static int[] dirY = {1, -1, 0, 0};
	static Queue<int[]> q = new LinkedList<>();
	static boolean[][] visit;
	
	public static int getSafezoneCnt(int level) {
		
		int safezoneCnt = 0;

		for(int i=0; i<N; i++) {
			Arrays.fill(visit[i], false);
		}
		q.clear();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				
				if(!visit[i][j] && map[i][j]>level ) {
					visit[i][j]=true;
					q.add(new int[] {i,j});
					safezoneCnt++;
				}
				
				while(!q.isEmpty()) {
					int[] area = q.poll();
					
					//상하좌우지역이 방문안했고 물에 잠기지 않았으면 Q에 넣음
					for(int k=0; k<4; k++) {
						int x = area[0]+dirX[k];
						int y = area[1]+dirY[k];
						
						if(x>=0 && y>=0 && x<N && y<N && !visit[x][y] && map[x][y]>level) {
							visit[x][y]=true;
							q.add(new int[] {x, y});
						}
					}
				}
				
			}
		}
		
		return safezoneCnt;
	}
	
	public static int getMaxSafezoneCnt(int maxLevel){
		
		int maxSafezoneCnt = 0;
		
		for(int i=0; i<=maxLevel; i++) {
			int safezoneCnt = getSafezoneCnt(i);
			maxSafezoneCnt = Math.max(maxSafezoneCnt, safezoneCnt);
		}

		return maxSafezoneCnt;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N][N];
			
		int maxHeight = 0;
		for( int i=0; i<N; i++) {
			String[] line = br.readLine().split(" ");
			for( int j=0; j<N; j++ ) {
				map[i][j] = Integer.parseInt(line[j]);
				maxHeight = Math.max(maxHeight, map[i][j]);
			}
		}
		br.close();
		
		System.out.println( getMaxSafezoneCnt(maxHeight) );
		
	}
}
