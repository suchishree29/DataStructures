package string;

import java.util.Arrays;

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
				
		//return true;
		return sort(str1).equals(sort(str2));
	}
	
	//Sorting the string first and then comparing
	String sort(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static void main(String[] args) {
		ChkPermutation cp = new ChkPermutation();
		System.out.println(cp.chkPermutation("hello", "ollhe"));

	}

}
