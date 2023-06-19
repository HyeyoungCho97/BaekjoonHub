import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M= Integer.parseInt(st.nextToken());
		int N= Integer.parseInt(st.nextToken());
		int[][] box= new int[N][M];
		Queue<Tomato> q= new LinkedList<Tomato>();
		int dx[] = {1, 0, -1, 0};
		int dy[] = {0, 1, 0, -1};
		int date = 0;
		//box 초기화 및 q에 넣기
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				box[i][j]=Integer.parseInt(st.nextToken());
				if(box[i][j]==1) q.offer(new Tomato(i, j, 0));
			}
		}
		while(!q.isEmpty()) {
			Tomato tomato= q.poll();
			date = (tomato.day > date)? tomato.day: date;
			//System.out.println(tomato.locX+" "+tomato.locY);
			for(int i=0; i<4; i++) {
				int toX = tomato.locX+dx[i];
				int toY = tomato.locY+dy[i];
				//System.out.println(toX+" "+toY);
				if(toX<0 || toX>=N || toY<0 || toY>=M ) continue;
				if(box[toX][toY]==-1)continue;
				
				if(box[toX][toY]==0) {
					//System.out.println(toX+" "+toY);
					q.offer(new Tomato(toX, toY, tomato.day+1));
					box[toX][toY]=1;
				}	
			}	
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(box[i][j] ==0) {
					date=-1;
					break;
				}
			}
		}
		
		System.out.println(date);
		
		
	}

}
class Tomato{
	int locX;
	int locY;
	int day;
	
	Tomato(int locX, int locY, int day) {
		this.locX= locX;
		this.locY= locY;
		this.day= day;
	}
}
