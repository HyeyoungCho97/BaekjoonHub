import java.io.*;
import java.util.*;

public class Main{
	
	final static int NUM =3;
	
	public static void main (String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		String answer="";
		
		//A,B중 상수에게 더 큰 수를 찾음
		for (int i=0; i<NUM; i++) {
			int index = NUM-i-1;
			if (A.charAt(index) > B.charAt(index)) {answer = A; break;}
			else if (A.charAt(index) < B.charAt(index)) {answer = B; break;}
		}
		// 더 큰수를 StringBuilder에 저장
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<NUM; i++) {
			int index = NUM-i-1;
			sb.append(answer.charAt(index));
		}
		
		System.out.println(sb);
		
	}
}