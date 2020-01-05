package N_50_59;
/**
 * 循环左移
 *1.以位移位置旋转两次，再旋转一次
 *2.不用考虑太多，直接字符串截取（有时解决问题才是关键）
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
	
	private static String leftRotate_2(String str, int num){
		if(str==null || str.isEmpty())
			return str;
		return str.substring(num) + str.substring(0, num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcXYZ";
		System.out.println(leftRotate(str,3));
		System.out.println(leftRotate_2(str, 3));
	}

}
