import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static void main (String[] args)throws IOException{
	
		int[] chess = {1, 1, 2, 2, 2, 8};
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int c=0; c<chess.length; c++) {
			sb.append(chess[c]-Integer.parseInt(st.nextToken())+" ");
		}
		
		System.out.println(sb);
	}
}