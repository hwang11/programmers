package level5;
class OneTwoFour {
	public String change124(int n) {
		String answer="";
		char arr[] = {'1', '2', '4'};	
		int a,b;
		a=-1;
		while(a!=0) {
			a = (n-1)/3;
			b = (n-1)%3;
			answer = arr[b] + answer;
			n = a;
		}
		return answer;
		
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(22));
	}
}

