686. Repeated String Match
Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

Note:
The length of A and B will be between 1 and 10000.

class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder as = new StringBuilder(A);
        for(int i = 1; i<=B.length() / A.length() + 2; i++){
            if(as.toString().contains(B)){
                return i;
            }
            as.append(A);
        }
        return -1;
    }
}
