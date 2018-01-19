package string;

public class StringCompression {
	
	String stringCompression(String s){
		int count = 1;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		for(int i = 1; i < s.length();i++){
			
			if(s.charAt(i-1) == s.charAt(i)){
				count++;
			}else {
				sb.append(count);
				sb.append(s.charAt(i));
				count = 1;
			}
		}
		sb.append(count);
		if(s.length() < sb.length()){
			return s;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		System.out.println(sc.stringCompression("aaaabbbbcddd"));

	}

}

O/p - a4b4c1d3
