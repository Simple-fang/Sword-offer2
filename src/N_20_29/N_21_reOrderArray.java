package N_20_29;
/*
 * 使数组中奇数排在偶数前面
 * 法1：类似于快排思想，从两边往中间遍历，一次遍历即可
 * 法2：统计数组中奇数个数，构造新数组
 * 法3：冒泡排序思想，相邻两个数一奇一偶则交换，每次将一个偶数排到数组末尾
 */
public class N_21_reOrderArray {

	public static void reOrder1(int[] array) {
		int i=0, j=array.length-1;
		while(i<j) {
			while(i<j && !isEven(array[i])) {
				i++;
			}
			while(i<j && isEven(array[j])) {
				j--;
			}
			
			if(i<j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
	
	public static int[] reOrder2(int[] array) {
		int[] copyArray = new int[array.length];
		// 奇数个数
		int oddNum = 0;
		for(int i : array) {
			if(!isEven(i)) {
				oddNum++;
			}
		}
		
		int i=0, j=oddNum;
		for(int num : array) {
			if(!isEven(num)) {
				copyArray[i++] = num;
			}else {
				copyArray[j++] = num;
			}
		}
		
		return copyArray;
	}
	
	public static void reOrder3(int[] array) {
		
		for(int i=array.length-1 ; i>0 ; i--) {
			for(int j=0 ; j<i ; j++) {
				if(isEven(array[j])&&!isEven(array[j+1])) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static boolean isEven(int n) {
		return n%2 == 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4,5,7,7,6};
//		reOrder1(data);
//		data = reOrder2(data);
		reOrder3(data);
		for(int i : data) {
			System.out.print(i+" ");
		}
	}

}
