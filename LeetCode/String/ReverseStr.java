/*541. Reverse String II
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]*/

package string;

public class ReverseStr {
	
	public String reverseStr(String s, int k) {
		
		if(s.length() == 0) {
			return null;
		}
		
		
		char[] arr = s.toCharArray();
		int n = arr.length;
		
		for(int i = 0; i<n; i+=2*k){
			int len = Math.min(n-1,i+k-1);
			for(int j = i; j<len; j++){
				char temp = arr[j];
				System.out.println(arr[len]);
				arr[j] = arr[len];
				arr[len] = temp;
				len--;
			}
		}
        return new String(arr);
    }
	
	

	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println(rs.reverseStr("abcdefg", 8));

	}

}
