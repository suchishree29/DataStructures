/*27. Remove Element
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.*/



package Array;

public class RemoveElement {
	 public int removeElement(int[] nums, int val) {
	        
	        if((nums.length == 0) || (nums.length == 1 && val == nums[0])) {
	            return 0;
	        }
	       else if(nums.length == 1) {
	           return nums[0];
	       }
	        
	        int i = 0;
	        
	        for(int j = 0; j < nums.length; j++){
	            if( val != nums[j]) {
	               nums[i] = nums[j];
	                i++;
	            }
	        }
	       return i; 
	    }

	public static void main(String[] args) {
		int[] nums ={3,2,2,3};
		int val = 3;
		RemoveElement re = new RemoveElement();
		System.out.println(re.removeElement(nums, val));

	}

}
