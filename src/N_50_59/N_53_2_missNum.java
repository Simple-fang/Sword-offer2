package N_50_59;
/**
 * 0-n中缺失的数字
 * @author fangyinrui
 *
 */
public class N_53_2_missNum {

	/*
	 * 递增数组，用二分法找出第一个数值不等于下标
	 */
	public static int find(int[] arr) {
		int l=0, h=arr.length-1;
		while(l<=h) {
			int m = (l+h)/2;
			if(arr[m]==m) {
				l = m+1;
			}else {
				h = m-1;
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2};
		int[] arr2 = {0,1,2,4,5};
		System.out.println(find(arr1));
		System.out.println(find(arr2));
	}

}
