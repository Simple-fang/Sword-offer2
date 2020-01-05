package N_50_59;
/**
 * 数字在排序数组中出现的次数
 * @author fangyinrui
 *
 */
public class N_53_numOfK {

	/*
	 * 直接查找，时间复杂度是O(n),排序数组:考察二分法应用
	 * 只需找到K首次出现的位置和K+1在排序数组中出现的位置(K+1是否存在无关)
	 */
	public static int GetNumberOfK(int[] nums, int K) {
	    int first = binarySearch(nums, K);
	    int last = binarySearch(nums, K + 1);
	    return (first == nums.length || nums[first] != K) ? 0 : last - first;
	}

	private static int binarySearch(int[] nums, int K) {
	    int l = 0, h = nums.length;
	    while (l < h) {
	        int m = l + (h - l) / 2;
	        if (nums[m] >= K)
	            h = m;
	        else
	            l = m + 1;
	    }
	    return l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,3,3,3,5,6};
		System.out.println(GetNumberOfK(nums, 3));
	}

}
