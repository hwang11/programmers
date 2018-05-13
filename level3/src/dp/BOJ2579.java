package dp;
import java.util.*;
public class BOJ2579 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[300];
		//int dp[] = new int[300];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=n;i>2;i-=2){
			a[i]+=Math.max(a[i-1],a[i-2]);
		}
		
		System.out.println(a[n]);
	
		
		
		
	}
}
