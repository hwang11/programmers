package level3;

import java.util.*;

class NoOvertime {
 
	public int noOvertime(int no, int[] works) {
		int result,sum,k;
    result = sum = k = 0;
		// 야근 지수를 최소화 하였을 때의 야근 지수는 몇일까요?
    Arrays.sort(works);
 

    for(int i=0; i<works.length;i++){
				sum +=works[i];
    }
		    if(no>sum) return 0;

   for(int i = 0; i < no; i++)
	{	
		for(k = works.length-1 ; k > 0; k--)
		{
			if(works[k] > works[k-1]) break;
		}
		works[k] -= 1;
	}
        for(int j=0;j<works.length;j++){
            result += Math.pow(works[j],2);}
        return result;
  		
  }
	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int []test = {6,4,2,2};
		System.out.println("야근지수:"+c.noOvertime(4,test));
	}
}
