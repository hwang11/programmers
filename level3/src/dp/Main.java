package dp;
import java.util.*;
public class Main {	
	public int rgb(int n[][],int le) {
		for(int i=1;i<le;i++) {
			n[i][0]+= Math.min(n[i-1][1], n[i-1][2]);
			n[i][1]+= Math.min(n[i-1][0], n[i-1][2]);
			n[i][2]+= Math.min(n[i-1][1], n[i-1][0]);			
		}
		int min = 0;
		min = Math.min(n[le-1][0], n[le-1][1]);
		min = Math.min(min, n[le-1][2]);
		return min;
	}

	public static void main (String[] args){
		Main m = new Main();
		Scanner scan =  new Scanner(System.in);
		int s = 0;
		s = scan.nextInt();
		int a[][];
	    a=new int[1000][3];
	    for(int i=0;i<s;i++) {
	    	for(int j=0;j<3;j++) {
	    		a[i][j]=scan.nextInt();
	    	 }
	     }
	    System.out.println(m.rgb(a,s));
	}
}
