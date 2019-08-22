package N_50_59;
/**
 * 循环左移
 *
 */
public class N_58_2_leftRoate {

	public static String leftRotate(String str,int k) {
		char[] cs = str.toCharArray();
		reverse(cs,0,k-1);
		reverse(cs,k,cs.length-1);
		reverse(cs,0,cs.length-1);
		
		return String.valueOf(cs);
	}
	
	public static void reverse(char[] cs , int i , int j) {
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
		String str = "abcXYZ";
		System.out.println(leftRotate(str,3));
	}

}
