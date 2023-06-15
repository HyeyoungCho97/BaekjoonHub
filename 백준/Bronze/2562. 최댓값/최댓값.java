import java.io.*;


public class Main{
	
	final static int CNT = 9;
	
	public static void main (String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max=0;
		int idx=0;
		int maxIdx=0;
		
		for(int i=0; i<CNT; i++) {
			int num= Integer.parseInt(br.readLine());
			idx++;
			if(num>max) {
				max=num;
				maxIdx=idx;
			}
		}
		System.out.println(max);
		System.out.println(maxIdx);
	}
}
