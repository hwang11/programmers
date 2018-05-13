package level5;
import java.util.*;

public class Hanoi {

	public static String[] hanoi(int topN, String i,String j, String k) {
				  double u = Math.pow(topN, 2)-1; 
				  String[] answer = new String[10];
				  int m = 0;
			      if (topN == 1){
			         answer[0] ="["+i+","+k+"]";
					 m++;
			      }else {
			         hanoi(topN - 1, i, k, j);
			         //answer[m]="["+i+","+k+"]";
					 m++;
			         hanoi(topN - 1, j, i, k);
			      }
			         return answer;
	}
	
	   public static void main(String[] args) {
	      Hanoi h = new Hanoi();
		  System.out.println(Arrays.toString(h.hanoi(3,"1","2","3")));
	   }
	
	/*public static void main(String args[]) {
		String[] a = new String[10];
		String i="1";
		String j="2";
		String k="3";
		a[0]="["+i;
		System.out.println(a[0]);
		
	}*/
	   
}