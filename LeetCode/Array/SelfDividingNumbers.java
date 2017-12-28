import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++)
            if (dividingNumber(i)) res.add(i);
        return res;
    }

    boolean dividingNumber(int num) {
        for (int n = num; n > 0; n /= 10) {
        	System.out.println("Printed n value   :   "+(n%10)  +" Printed num value:   "+num);
        	if (n % 10 == 0 || num % (n % 10) != 0) return false;
        }
        		
        
        return true;
    }
    public static void main(String[] args) {
    		Solution sd = new Solution();
    		
    		int number = 128; 

    		while (number > 0) {
    		    System.out.println("Number:"+number + "Number mod 10::::::    "+number % 10);
    		    number = number / 10;
    		}
    		System.out.println(sd.selfDividingNumbers(1, 130));
    }
   
}
