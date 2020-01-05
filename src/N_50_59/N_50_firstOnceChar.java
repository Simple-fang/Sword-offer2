package N_50_59;

import java.util.HashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符
 * @author fangyinrui
 *
 */
public class N_50_firstOnceChar {

	public static Character onceChar(String str) {
		if(str==null || str.isEmpty())
			return null;
		Map<Character, Integer> map = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(char c : str.toCharArray()) {
			if(map.get(c)==1)
				return c;
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(onceChar("12312"));
	}

}
