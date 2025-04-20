import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		br.close();
		
		long[] dp = new long[N+1];
		dp[0] = 1;
		
		for(int i=1; i<N+1; i++) {
			
			dp[i] = dp[i-1];
			
			if(i>=M) {
				dp[i] += dp[i-M];
			}
			
			dp[i] = dp[i]%1000000007;
			
		}
		
		System.out.println(dp[N]);		
	}
}