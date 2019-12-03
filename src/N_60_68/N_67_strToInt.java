package N_60_68;

public class N_67_strToInt {

	public static int convert(String str){
		if(str==null || str.length()==0)
			return 0;
		int flag = str.charAt(0)=='-' ? -1 : 1;
		int res = 0;
		
		for(int i=0 ; i<str.length() ; i++){
			char c = str.charAt(i);
			if(i==0 & (c=='+' || c=='-'))
				continue;
			if(c<'0' || c>'9')
				return 0;
			
			res = res*10 + (c-'0');
		}
		return flag*res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "+123";
		String str2 = "-456";
		System.out.println(convert(str));
		System.out.println(convert(str2));
	}

}
