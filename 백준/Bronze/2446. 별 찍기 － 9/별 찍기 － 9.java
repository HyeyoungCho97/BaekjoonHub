import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int full = 2*n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<full-(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1; i>0; i--) {
			for(int j=i-1; j>0;j--) {
				System.out.print(" ");
			}
			for(int j=full-(2*(i-1)); j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}