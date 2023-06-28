
import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int M;
	static int[] arr= new int[10];
	static boolean[] used= new boolean[10];
	
	public static void func(int k) {
		
		if(k==M) {
			for(int i=0; i<M; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(!used[i]) {
				arr[k]=i;
				used[i]=true;
				func(k+1);
				used[i]=false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String cmd= br.readLine();
		N = cmd.charAt(0)-48;
		M = cmd.charAt(2)-48;	
		
		func(0);
	}
}		