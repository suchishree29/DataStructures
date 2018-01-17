package string;

public class ChkPermutation {
	
	boolean chkPermutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		int[] letters = new int[128];
		
		char[] chr = str1.toCharArray();
		for(char c: chr){
			letters[c]++;
		}
		
		for(int i = 0; i<str2.length();i++){
			int c = (int) str2.charAt(i);
			letters[c]--;
			if(letters[c] < 0){
				return false;
			}
		}
				
		return true;
	}

	public static void main(String[] args) {
		ChkPermutation cp = new ChkPermutation();
		System.out.println(cp.chkPermutation("helloi", "ollheh"));

	}

}
