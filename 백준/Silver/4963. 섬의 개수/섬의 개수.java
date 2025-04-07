import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	
	static int[][] map;
	static boolean[][] visit;
	static int[] dy = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
	static Queue<int[]> q;
	static LinkedList<Integer> answer = new LinkedList<>();
	
	public static void printIslandCnt(int w,int h) {
		
		q = new LinkedList<>();
		int cnt = 0;
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++){
				
				if (!visit[i][j] && map[i][j]==1 ) {
					visit[i][j] = true;
					q.add(new int[] {i, j});
					cnt += 1;
				}
				
				while( !q.isEmpty() ) {
					
					int[] dot = q.poll();
					int x, y;
					for(int k=0; k<dx.length; k++) {
						x = dot[0] + dx[k];
						y = dot[1] + dy[k];
						
						if( x>=0 && x<h && y>=0 && y<w) {
							if( !visit[x][y] && map[x][y] ==1 ) {
								visit[x][y] = true;
								q.add(new int[] {x, y});
							}
						}
					}
				}
			}
		}
		
		answer.add(cnt);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		while( !("0".equals(input[0]) && "0".equals(input[1]) ) ) {
			
			int w = Integer.parseInt(input[0]);
			int h = Integer.parseInt(input[1]);
			map = new int[h][w];
			visit = new boolean[h][w];
			for(int i=0; i<h; i++) {
				Arrays.fill(map[i], 0);
				Arrays.fill(visit[i], false);
			}
			
			String[] line = new String[w];
			for(int i=0; i<h; i++) {
				line = br.readLine().split(" ");
				for(int j=0; j<w; j++) {
					map[i][j] = Integer.parseInt(line[j]);
				}
			}
			//
			printIslandCnt(w, h);
			
			//
			input = br.readLine().split(" ");
		}
		
		System.out.println( answer.toString().replace("[", "").replace("]", "").replace(", ","\n"));
		
	}
}
