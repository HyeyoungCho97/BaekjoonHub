import java.io.*;


public class Main{
	static final int THOUSAND = 10000;
	
	public static void removeDn(int n, boolean[] arr) {
		
		String strN = n+"";
		int next = n;
		for(char c: strN.toCharArray()) {
			next += Integer.parseInt(Character.toString(c));
		}
		//System.out.println("remove :"+next);
		
		if(next<arr.length)arr[next]=true;
		else return;
		
		removeDn(next, arr);
		
	}
	
	public static void checkNotSelf(boolean[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=true) {
				removeDn(i, arr);
			}
			
		}
	}
	
	public static void main (String[] args) throws IOException{
		
		boolean[] thousand = new boolean[THOUSAND+1];
		
		checkNotSelf(thousand);
		
		for(int i=1; i<thousand.length; i++) {
			if(thousand[i]==false)System.out.println(i); 
		}
	}
}