package level;

public class Expressions {
	public int expressions(int num) {
		/*
		int answer = 1;
		if(num%2!=0) answer++;
		int a = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				a = num/i;
				if(a%2!=0) answer++;
			}
		}
		return answer;*/
		        int answer = 0;
		        for (int i = 1; i <= num; i += 2) {
		            if (num % i == 0) {
		                answer++;
		            }
		        }
		        return answer;
		    }
		    
	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}
}
