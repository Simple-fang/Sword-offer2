package N_1_9;

/**
 * 二维数组，从左至右递增，从上至下递增，判断该数组是否给定数字
 * 
 * @author fangyinrui
 *
 */
public class N_4_numInMatrix {

	/*
	 * 关键是要找到数组特点，缩小查找空间（对于开始选定的数与target比较大小后一定要能缩小查找空间）
	 */
	public static boolean find(int[][] matrix, int target) {
		if (matrix == null)
			return false;
		int row = matrix.length, col = matrix[0].length;
		int r = 0, c = col - 1;
		while (r < row && c >= 0) {
			if (matrix[r][c] == target)
				return true;
			else if (matrix[r][c] > target)
				c--;
			else
				r++;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		System.out.println(find(data, 10));
		System.out.println(find(data, 5));
	}

}
