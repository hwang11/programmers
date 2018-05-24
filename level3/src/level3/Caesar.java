package level3;
//level3
public class Caesar {
	String caesar(String s, int n) {
		String result = "";
		int a, k;
		a = k = 0;
    //n %= 26;
	    for(int i=0; i<s.length();i++){
	      k = (int)s.charAt(i);
	      a = k + n;
        if(s.charAt(i) == ' '){
        	result+= " ";
        }
	      else if(k>=65 && k<=90) {
	    	  if(a>90)
	        	result += (char)((65+(a-91)%26));
        }
	      else if(k>=97 && k<=122){
          if(a>122)
	        	result += (char)((97+(a-123)%26)); 
        }
      }
		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 30));
	}
}
