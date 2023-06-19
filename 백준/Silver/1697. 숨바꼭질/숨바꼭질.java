
import java.io.*;
import java.util.*;

public class Main {
	
	final static int SIZE = 1000001;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N= Integer.parseInt(st.nextToken());
		int K= Integer.parseInt(st.nextToken());
		
		int[] road= new int[SIZE];
		boolean[] visit = new boolean[SIZE];
		int answer=Integer.MAX_VALUE;
		Queue<Location> q = new LinkedList<Location>();
		q.offer(new Location(N, 0));
		visit[N]= true;
		
		while(!q.isEmpty()) {
			
			Location curr = q.poll();
			if(curr.loc==K) {
				if(curr.time < answer) answer= curr.time;
				break;
			}
			
			if(curr.loc+1>=0 && curr.loc+1<SIZE && visit[curr.loc+1]==false) {
				q.offer(new Location(curr.loc+1, curr.time+1));
				visit[curr.loc+1]=true;
			}
			if(curr.loc-1>=0 && curr.loc-1<SIZE && visit[curr.loc-1]==false) {
				q.offer(new Location(curr.loc-1, curr.time+1));
				visit[curr.loc-1]=true;
			}
			if(curr.loc*2>=0 && curr.loc*2<SIZE && visit[curr.loc*2]==false) {
				q.offer(new Location(curr.loc*2, curr.time+1));
				visit[curr.loc*2]=true;
			}
			
		}
		
		System.out.println(answer);
	
		
	}
}

class Location{
	int loc;
	int time;
	
	Location(int loc, int time){
		this.loc= loc;
		this.time= time;
	}
}