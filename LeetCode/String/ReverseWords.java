/*557. Reverse Words in a String III

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
*/


package string;

public class ReverseWords {
	
	public String reverseWords(String s) {
		char[] arr = s.toCharArray();
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] != ' '){
				int j = i;
				while(j+1 < arr.length && arr[j+1] != ' '){
					j++;
				}
				reverse(arr,i,j);
				i = j+1;
			}
		}
		
		return new String(arr);
        
    }
	
	String reverse(char[] arr, int left, int right){
		
		while(left < right){
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		return new String(arr);
	}

	public static void main(String[] args) {
		
		ReverseWords rw = new ReverseWords();
		System.out.println(rw.reverseWords("Let's take LeetCode contest"));
	}

}
