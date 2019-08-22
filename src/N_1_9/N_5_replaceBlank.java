package N_1_9;

/**
 * 替换空格为%20 （test）
 *
 */
public class N_5_replaceBlank {

	public static String replace(String str){
		StringBuffer sb = new StringBuffer();
		for(char c : str.toCharArray()){
			if(c==' '){
				sb.append("%20");
				continue;
			}
			sb.append(c);
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("ab c "));
		
	}

}
