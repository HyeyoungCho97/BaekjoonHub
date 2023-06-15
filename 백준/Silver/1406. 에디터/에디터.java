import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] word = br.readLine().toCharArray();
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		for(char c: word) {
			left.push(c);
		}
		
		int M = Integer.parseInt(br.readLine());
		for(int i=0; i<M; i++) {
			char[] cmdLine = br.readLine().toCharArray();			
			if(cmdLine[0]=='L') {
				if(left.size()!=0) right.push(left.pop());
			}
			else if(cmdLine[0]=='D') {
				if(right.size()!=0) left.push(right.pop());
			}
			else if(cmdLine[0]=='B') {
				if(left.size()!=0) left.pop();
			}
			else if(cmdLine[0]=='P') {
                // 커서 기준 오른쪽에 문자 1개 add
				left.push(cmdLine[2]);
            }
		}
		
		//		StringBuilder sbL = new StringBuilder();
//		StringBuilder sbR = new StringBuilder();
//		while(left.size()!=0) {
//			sbL.insert(0, left.pop());
//		}
//		//System.out.println(sbL.toString());
//		while(right.size()!=0) {
//			sbR.append(right.pop());
//		}
		//System.out.println(sbR.toString());
//		sbL.append(sbR.toString());
		
		for(char c: left) {
			bw.write(c);
		}
		while(right.size()!=0) {
			bw.write(right.pop());
		}
		
		
		bw.flush();
		bw.close();
	}

}