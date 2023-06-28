import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int S;
	static int answer;
	static int[] nums;

	public static void addNum(int curr, int sum) {
		//System.out.println(curr+" "+sum);
		if(curr==N) {
			if(S==sum)answer++;
			return;
		}
		
		addNum(curr+1, sum);
		addNum(curr+1, sum+nums[curr]);
		
	}
	public static void main(String[] args) throws Exception {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N= Integer.parseInt(st.nextToken());
		S= Integer.parseInt(st.nextToken());
		
		nums= new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) nums[i]= Integer.parseInt(st.nextToken());
		
		addNum(0, 0);
		
		if(S==0) answer -=1;
		System.out.println(answer);

	}
}		