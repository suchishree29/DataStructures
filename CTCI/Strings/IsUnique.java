package string;

import java.util.HashMap;

public class IsUnique {
	
	
	public boolean isUnique(String str){
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
	}

	public static void main(String[] args) {
		IsUnique unn = new IsUnique();
		System.out.println(unn.isUnique("Suchis"));
		
		
	}

}
