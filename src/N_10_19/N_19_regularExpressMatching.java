package N_10_19;
/**
 * 正则表达式匹配
 * .(任何一个字符)和*(前面的字符任意次数)
 * @author fangyinrui
 *
 */
public class N_19_regularExpressMatching {

	
	/*
	 * 思路： 模式串中'.'相当于是万能字符，正常匹配即可；
	 * '*'涉及到前一个字符，需分后一个字符不是‘*’&没后一个字符  和 后一个字符是'*'的情况。
	 */
	private static boolean match(String str, String pattern) {
		if(str==null || pattern==null)
			return false;
		return matchCore(str, 0, pattern, 0);
	}
	
	private static boolean matchCore(String str, int strIndex, String pattern, int patternIndex) {
		if(strIndex==str.length() && patternIndex==pattern.length())
			return true;
		// 模式串已匹配完，字符串没有匹配完，false
		if(patternIndex==pattern.length() && strIndex!=str.length())
			return false;
		// 字符串匹配完，模式串未匹配完
		if(strIndex==str.length() && patternIndex!=pattern.length()) {
			if(patternIndex+1<pattern.length() && pattern.charAt(patternIndex+1)=='*') {
				return matchCore(str, strIndex, pattern, patternIndex+2);
			}else {
				return false;
			}
		}
		// 如果模式串下一个字符不是 * 或是最后一个模式字符
		if(patternIndex+1==pattern.length() || pattern.charAt(patternIndex+1)!='*') {
			if(str.charAt(strIndex)==pattern.charAt(patternIndex) || pattern.charAt(patternIndex)=='.') {
				return matchCore(str, strIndex+1, pattern, patternIndex+1);
			}else {
				return false;
			}
		}
		// 模式串下一个字符为*
		else {
			if(pattern.charAt(patternIndex)=='.' || pattern.charAt(patternIndex)==str.charAt(strIndex)) {
				return matchCore(str, strIndex+1, pattern, patternIndex)	//模式串*匹配多个
						|| matchCore(str, strIndex+1, pattern, patternIndex+2)	//模式串*匹配一个
						|| matchCore(str, strIndex, pattern, patternIndex+2);	//模式串*匹配0个
			}else {
				return matchCore(str, strIndex, pattern, patternIndex+2);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(match("aaa", "a.a"));
		System.out.println(match("aaa", "ab*ac*a"));
		System.out.println(match("aaa", "aa.a"));
		System.out.println(match("aaa", "ab*a"));
		
		
		
	}

}
