import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int m = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		String[] sticksStr = br.readLine().split(" ");
		int[] sticks = new int[n];
		
		br.close();
		
		int left = 1;
		int right = sticks[n-1];
		
		for(int i=0; i<n; i++) {
			sticks[i] = Integer.parseInt(sticksStr[i]);
			if (sticks[i] > right) right = sticks[i];
		}
		
		
		int answer = 0;
		int mid, count;
		while(left <= right) {
			
			mid = (left+right)/2;
			count=0;
			for(int i=0; i<n; i++) {
				count += sticks[i]/mid;
			}
			
			if (count>= m) {
				answer = mid;
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		
		System.out.println(answer);
		
		
	}
}
