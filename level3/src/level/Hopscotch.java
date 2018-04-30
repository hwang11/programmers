package level;

class Hopscotch {
    int hopscotch(int[][] board, int size) {
        int result = 0;
        // 함수를 완성하세요.
        int a = 0;
        int max = 0;
        int maxi = 0;
        for(int i=0; i<size;i++) {
        	max = board[i][0];
	        for(int j=0;j<4;j++) {
	        	if(board[i][j]>max) {
	        		if(a != j){
	        			System.out.println("j:"+j);
		        		max = board[i][j];
		        		maxi = j;
		        	}
	        	}
	        	maxi = j;
	        }
	        a = maxi;
	        System.out.println("a="+a);
	        
	        result+=max;
	        System.out.println("result:"+result);
        }
        return result;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = {{1, 5, 9, 3}, {2, 5, 5, 7}, {7, 6, 5, 6}, {10, 2, 8, 7}, {5, 10, 2, 9}};
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 5));
    }

}