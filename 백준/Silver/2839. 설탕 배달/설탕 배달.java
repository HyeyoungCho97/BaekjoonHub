import java.io.*;


public class Main{
	
	public static int first5(int N) {
		
		if(N%5==0) {
			//System.out.println("1 ");
			return N/5;
		}else {
			//System.out.println("2 ");
			for(int i=N/5; i>0; i--) {
				if(second3(N-(5*i))!=-1) return i+second3(N-(5*i));
			}
			return -1;
		}
		
	}
	public static int second3(int N) {
		//System.out.println("3 ");
		if(N%3==0) return N/3;
		else return -1;
	}
	
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = first5(N);
		if(count==-1) count=second3(N);
		
		System.out.println(count);
		
	}
}
