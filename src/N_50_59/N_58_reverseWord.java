package N_50_59;

public class N_58_reverseWord {

	
	public static String reverse(String str) {
		char[] cs = str.toCharArray();
		int i=0 , j=0;
		int n = cs.length;
		while(j<=n) {
			if(j==n || cs[j]==' ') {
				reverseCore(cs,i,j-1);
				i = j+1;
			}
			j++;
		}
		reverseCore(cs,0,n-1);
		
		return String.valueOf(cs);
	}
	
	public static void reverseCore(char[] cs , int i , int j) {
		while(i<=j) {
			char t = cs[i];
			cs[i] = cs[j];
			cs[j] = t;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a programmer";
		System.out.println(reverse(str));
	}

}
