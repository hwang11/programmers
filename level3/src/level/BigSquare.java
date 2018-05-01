package level;

public class BigSquare {
	 public int findLargestSquare(char [][]board)
	    {
	        int answer = 0;

	        return answer;
	    }
	    public static void main(String[] args)
	    {
	    	BigSquare test = new BigSquare();
					char [][]board ={
					{'X','O','O','O','X'},
					{'X','O','O','O','O'},
					{'X','X','O','O','O'},
					{'X','X','O','O','O'},
					{'X','X','X','X','X'}};

	        System.out.println(test.findLargestSquare(board));
	    }
}
