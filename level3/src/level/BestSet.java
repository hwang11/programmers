package level;
import java.util.*;
public class BestSet {
	
	   public int[] bestSet(int n, int s){
		        int[] answer = null;
		        if(n>s) {
		            answer = new int[1];
		            answer[0]=-1;
		            return answer;
		        }
		        answer = new int[n];
		        int a = s/n;
		        for(int i=0;i<n;i++) {
		            answer[i]=a;
		        }
		        for(int i=0;i<s%n;i++) {
		            answer[n-1-i]++;
		        }
		        return answer;
		    }
	    public static void main(String[] args) {
	        BestSet c = new BestSet();
	        System.out.println(Arrays.toString(c.bestSet(3,13)));
	    }

}
