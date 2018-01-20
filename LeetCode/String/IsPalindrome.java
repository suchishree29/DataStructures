/*125. Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.*/

package string;

public class IsPalindrome {
	public boolean isPalindrome(String s) {
		
		if(s.length() == 0){
			return true;
		}
		
		int i = 0;
		int j = s.length()-1;
		s = s.toUpperCase();
		
		while(i<j){
			if(s.charAt(i) == s.charAt(j) && Character.isLetterOrDigit(s.charAt(i))){
					i++;
					j--;
			}else if(!Character.isLetterOrDigit(s.charAt(i))){
				i++;
			}else if(!Character.isLetterOrDigit(s.charAt(j))){
				j--;
			}else{
				return false;
				
			}
		}
       return true; 
    }
	
	public static void main(String[] args) {
		IsPalindrome p = new IsPalindrome();
		System.out.println(p.isPalindrome("A man, a plan, a canal: Panama"));
	}

}
