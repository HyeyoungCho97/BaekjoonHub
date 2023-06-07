import java.io.*;


public class Main{
	public static boolean isHansu(int n) {
		
		char[] charN = (n+"").toCharArray();
		int temp= Integer.parseInt(Character.toString(charN[0]))-Integer.parseInt(Character.toString(charN[1]));
		
		for(int i=1; i<charN.length-1; i++) {
			if(temp != Integer.parseInt(Character.toString(charN[i]))-Integer.parseInt(Character.toString(charN[i+1]))) {
				return false;
			}
		}
		
		return true;
	}
	public static int getCountOfHansu(int N) {
		
		if(N<=99) return N;
		
		int counter=99;
		for(int i=111; i<=N; i++) {
			if(isHansu(i)) counter++;
		}
		
		return counter;
	}
	
	public static void main (String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getCountOfHansu(N));
		
	}
}