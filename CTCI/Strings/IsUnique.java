package string;

import java.util.HashMap;

public class IsUnique {
	
	
/*	public boolean isUnique(String str){
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();

		for(int i=0; i<str.length();i++){
			if(hm.get(str.charAt(i)) != null ) {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
				return false;
			}
			else{
				hm.put(str.charAt(i),1);
			}
		}
		
		return true;
	}*/
	
	boolean isUnique(String str){
		
		if(str.length() > 128){
			return false;
		}
		
		boolean[] arr = new boolean[128];
		
		for(int i = 0; i<str.length();i++){
			int val = str.charAt(i);
			
			if(arr[val]){
				return false;
			}
			arr[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		IsUnique unn = new IsUnique();
		System.out.println(unn.isUnique("Suchishree"));
		
		
	}

}
