package dp;
import java.util.*;
public class BOJ2193 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long dp[] = new long[90];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		System.out.println(dp[n]);
	}
}
