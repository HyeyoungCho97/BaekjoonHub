
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N= Integer.parseInt(br.readLine());
		StringTokenizer st;
		Member[] arr = new Member[N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i]= new Member(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		Arrays.sort(arr, (a, b)-> {return Integer.compare(a.age, b.age);});
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].age+" "+arr[i].name);
		}
		
	}
}		

class Member {
	
	int age;
	String name;
	
	Member(int age, String name){
		this.age= age;
		this.name= name;
	}
}