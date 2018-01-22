/*14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.*/

package string;

public class LongestCommonPrefix {
	
	 public String longestCommonPrefix(String[] strArr) {
		 
	       if(strArr == null) 
				 return "";
			 
			 if(strArr.length == 0)
				 return "";
			 //find the length of smallest string in string array
			 int min_len = Integer.MAX_VALUE;
			 for(int i =0; i<strArr.length; i++){
				 if(min_len > strArr[i].length()){
					 min_len = strArr[i].length();
				 }
			 }
			 StringBuilder sb = new StringBuilder();
			 boolean success = true;
			 String str = strArr[0]; // leets
			 for(int j = 0; j< min_len; j++){
				 	
				 
				 for( int i = 0; i<strArr.length; i++){
					 	
					 if(str.charAt(j) != strArr[i].charAt(j))
					 {
						success = false; 
						break;
					 }
					 
				 }
				 
				 if(success)
				 {
					 sb.append(str.charAt(j));
				 }
				 else 
					 break;
			 }
					 
		     return sb.toString();
	    }

	public static void main(String[] args) {
		
		//String[] strs = {"leets","leetcode","leet","leeds"};
		String[] strs = {"a"} ;
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		
		System.out.println(lcp.longestCommonPrefix(strs));
		
		
	}

}
