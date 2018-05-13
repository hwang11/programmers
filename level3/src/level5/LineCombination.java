package level5;

import java.util.Arrays;

public class LineCombination {
	public int[] setAlign(int n, long k,long le) {
		int[] answer = {};
		for(int i=0;i<k;i++) {
			for(int j=1;j<=n;j++) {
				answer[i]= j;
			}
		}
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		LineCombination lc = new LineCombination();
		
		int f=3;
		int result=1;
		for(int i=1;i<=f;i++) {
			result *=i;
		}
		System.out.println(result);
		System.out.println(Arrays.toString(lc.setAlign(3, 5,result)));
		
	}
}

