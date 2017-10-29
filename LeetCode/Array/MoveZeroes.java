/*283. Move Zeroes
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.*/

package Array;

public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
		
		if((nums == null) || (nums.length == 0)) return;
		
		int j = 0;
		for(int i:nums){
			if(i != 0){
				nums[j] = i;
				j++;
			}
		}
		while(j<nums.length){
			nums[j] = 0;
			j++;
		}
		for(int i : nums)
		System.out.println(i);
        
    }

	public static void main(String[] args) {
		
		int[] nums = {0, 1, 0, 3, 12};
		
		MoveZeroes mz = new MoveZeroes();	
		mz.moveZeroes(nums);
				
	}

}
