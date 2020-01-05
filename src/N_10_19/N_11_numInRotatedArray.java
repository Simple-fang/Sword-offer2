package N_10_19;
/**
 * 求非递减数组经旋转后的最小数字
 * @author fangyinrui
 *
 */
public class N_11_numInRotatedArray {

	/*
	 * 问题的关键如何将查找范围缩小，问题规模变小，
	 * 考察二分查找的思想，将旋转数组对半分，可以得到包含最小数字的旋转数组&非递减数组，关键是如何区分？
	 * 当arr[mid]<=arr[high],说明[mid,high]为非递减数组，旋转数组在[low,mid=1]；反之，说明[low,mid]为旋转数组
	 * 注意：如果数组非递增，可能出现arr[low]=arr[mid]=arr[high]的情况，这样需要一次遍历判断
	 */
	public static int find(int[] arr) {
		int l=0, h=arr.length-1;
		while(l<=h) {
			int m = (l+h)/2;
			if(arr[m]==arr[l] && arr[m]==arr[h]) {
				return findByOrder(arr, l, h);
			}else if(arr[m]<=arr[h]) {
				h = m;
			}else {
				l = m+1;
			}
		}
		return arr[l];
	}
	
	public static int findByOrder(int[]arr, int l, int h) {
		for(; l<h; l++) {
			if(arr[l] > arr[l+1])
				return arr[l+1];
		}
		return arr[l];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] data1 = {3,4,5,1,2};
        int[] data2 = {1,0,1,1,1};
        int[] data3 = {1,1,1,0,1};
        System.out.println(find(data1));
        System.out.println(find(data2));
        System.out.println(find(data3));

	}

}
