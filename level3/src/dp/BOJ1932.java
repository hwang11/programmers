package dp;
import java.util.*;
public class BOJ1932 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max=0;
		int a[][] = new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				a[i][j]=scan.nextInt();
				if(j==1) {
					a[i][j] += a[i-1][j];
				}
				else if(j==i) {
					a[i][j]+=a[i-1][j-1];
				}
				else {
				a[i][j]+=Math.max(a[i-1][j-1], a[i-1][j]);
				}
				
				if(max<a[i][j]) max = a[i][j];
			}
		}	
		System.out.println(max);
		
	}
}
