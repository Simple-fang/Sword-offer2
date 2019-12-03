package N_1_9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N_3_dupNum {

	//排序后遍历，重复数字挨着
	private static int find_dup_1(int[] arr) {
		Arrays.sort(arr);
		for(int i=0 ; i<arr.length-1 ; i++) {
			if(arr[i] == arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	//使用额外数据结构记录数字是否出现
	private static int find_dup_2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				return i;
			}
			map.put(i, 1);
		}
		return -1;
	}
	
	//根据数字特点（如果长度为n的数组元素为[0,n-1]，如果没有重复，则可调整为i位置元素为i）
	private static int find_dup_3(int[] arr) {
		if(arr==null || arr.length<2)
			return -1;
		for(int i=0 ; i<arr.length ; i++) {
			while(i!=arr[i]) {
				if(arr[i] == arr[arr[i]]) {
					return arr[i];
				}else {
					int temp = arr[i];
					arr[i] = arr[temp];
					arr[temp] = temp;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 1, 0, 2, 5};
		
		System.out.println(find_dup_1(arr));
		System.out.println(find_dup_2(arr));
		System.out.println(find_dup_3(arr));
	}

}
