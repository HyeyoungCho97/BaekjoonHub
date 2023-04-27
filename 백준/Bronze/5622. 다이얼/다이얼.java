import java.io.*;

public class Main{
	
	public static void main (String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int[] dial = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		int time=0;
		//각 문자를 숫자로 변환후 시간에 더해줌
		for(int w=0; w<word.length();w++) {

			int index = word.charAt(w)-'A';
			time += dial[index]+1;
		}
		
		System.out.println(time);
		
	}
}