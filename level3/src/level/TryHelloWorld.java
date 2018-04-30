package level;
import java.util.*;

public class TryHelloWorld {
    //인구수가 많은 곳이 이동거리가 가장 작은 도
    public int chooseCity(int n, int [][]city) {
    	int idx=city[0][0];
        int max = city[0][1];
        for(int i=1;i<n;i++) {
            if(city[i][1]>max) {
                max = city[i][1];
                idx = city[i][0];
            }
        }
        return idx;
    	/*
        int answer = 0;
      	int m = 0;
      	int distance = 0;
      	int temp = 0;
      	for(int i=0;i<n;i++) {
      		for(int j=i+1;j<n;j++) {
      			m = Math.abs(city[i][0]-city[j][0]);
          		distance += m*city[j][1];
          		}
      		if(temp==0||temp>=distance) {
      			if(temp == distance) {
      				if(answer>city[i][0]) {
      					answer = city[i][0];
      				}
      			}
      			else {
      				answer = city[i][0];	
      			}
  				temp = distance;

      			
      		}
      	}

        return answer;*/
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int tn = 3;
        int [][]tcity = {{1,5},{2,2},{3,3}};
        System.out.println(test.chooseCity(tn,tcity));
    }
}
