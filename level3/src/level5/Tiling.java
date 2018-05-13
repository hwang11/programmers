package level5;
import java.util.*;

class Tiling {
	public int tiling(int n) {
		int answer = 0;
		int dp[] = new int[100000];
		dp[0]=1; dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
            if(dp[i]/100000>0) dp[i] = dp[i]%100000;
		}
		return dp[n];
	}

	public static void main(String args[]) {
		Tiling tryHelloWorld = new Tiling();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.print(tryHelloWorld.tiling(3));
	}
}