/*387. First Unique Character in a String
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.*/

package string;

public class FirstUniqChar {
	public int firstUniqChar(String s) {
		if(s.length() == 0){
			return -1;
		}
		
		int[] arr = new int[128];
		char[] chr = s.toCharArray();
		for(char c: chr){
			arr[c]++;
		}
		
		for(int i = 0; i<s.length(); i++){
				int c = s.charAt(i);
				if(arr[c] == 1){
					return i;
				}
			}
			
		
		
		/*//bruteforce
		int i = 0;
		for(;i<s.length();i++){
			for(int j = 0; j<s.length(); j++){
				System.out.println("i  :" + i +"  j:  " + j);
				if((i == j) && (i ==s.length()-1)) {
					return i;
				}
				if(i == j){
					continue;
				}
				if(s.charAt(i) == s.charAt(j)){
					break;
				}else if(j ==s.length()-1){
					return i;
				}
				
			}
		}*/
		
        return -1;
    }

	public static void main(String[] args) {
		FirstUniqChar fc = new FirstUniqChar();
		System.out.println(fc.firstUniqChar(""));
	}

}
