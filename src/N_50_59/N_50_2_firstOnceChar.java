package N_50_59;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 字符流中第一次出现的字符
 * (需要有数据结构能保存输入的字符流，并要有数据结构对字符出现次数计数)
 * @author fangyinrui
 *
 */
public class N_50_2_firstOnceChar {

	public static class Util{
		// 计数
		private int[] cnts = new int[256];
		// 队列的特性保证队首元素是第一个出现的字符
		private Queue<Character> queue = new LinkedList<Character>();
		
		public void insert(char c) {
			cnts[c]++;
			queue.add(c);
			while(!queue.isEmpty() && cnts[queue.peek()]!=1) {
				queue.poll();
			}
		}
		
		public char getResult() {
			return queue.isEmpty() ? '#':queue.peek();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util util = new Util();
		util.insert('g');
		util.insert('o');
		util.insert('g');
		System.out.println(util.getResult());
	}

}
