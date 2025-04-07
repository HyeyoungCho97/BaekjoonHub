import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int m, n, k;
	static boolean[][] paper;
	static boolean[][] visit;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	static void drawRect(String[] input) {

		int startX = Integer.parseInt(input[0]);
		int startY = Integer.parseInt(input[1]);
		int endX = Integer.parseInt(input[2]);
		int endY = Integer.parseInt(input[3]);
		
		for(int j = startX; j<endX; j++) {
			for(int l=startY; l<endY; l++) {
				paper[l][j] = true;
			}
		}
	}
	
	static void initialize(boolean[][] rect) {
		for(int i=0; i<m; i++) {
			Arrays.fill(rect[i], false);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		m = Integer.parseInt(input[0]);
		n = Integer.parseInt(input[1]);
		k = Integer.parseInt(input[2]);
		paper = new boolean [m][n];
		initialize(paper);
		
		if(k != 0) {
			for(int i=0; i<k; i++) {
				input = br.readLine().split(" ");
				drawRect(input);
			}
		}else {
			System.out.println("1");
			System.out.println(m*n);
			return;
		}
		br.close();
		
		visit = new boolean[m][n];
		initialize(visit);
		Queue<int[]> q = new LinkedList();
		int areaCnt = 0;
		LinkedList<Integer> dimensions = new LinkedList<>();
		int dim = 0;		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				
				if(!visit[i][j] && !paper[i][j]) {
					visit[i][j] = true;
					areaCnt += 1;
					q.add(new int[] {i, j});
					dim = 1;
				}
				
				while(!q.isEmpty()) {
					int[] dot = q.poll();
					
					for(int l=0; l<4; l++) {
						int x= dot[0]+dx[l];
						int y= dot[1]+dy[l];
						if( x>=0 && y>=0 && x<m && y<n ) {
							if(!visit[x][y]&&!paper[x][y]) {
								visit[x][y] = true;
								q.add(new int[] {x, y});
								dim += 1;
							}
						}
					}
					if(q.isEmpty()) dimensions.add(dim);
				}
				
			}
		}
		
		
		System.out.println(areaCnt);
		Collections.sort(dimensions);
		System.out.println(dimensions.toString().trim().replace("[", "").replace("]", "").replace(", ", " "));
	}
	
}
