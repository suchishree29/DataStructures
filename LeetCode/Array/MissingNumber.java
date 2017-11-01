/*268. Missing Number
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.*/


package Array;

public class MissingNumber {
	
	public int missingNumber(int[] nums) {
		
		int sum = 0;
		int totalSum = 0;
		int j = 1;
		
		
		for(int i=0; i<nums.length;i++){
			sum = sum + nums[i];
			totalSum = totalSum + j;
			j++;
		}
		
		
		return totalSum - sum;
	}

	public static void main(String[] args) {
		int[] nums = {0,1,2,4};
		MissingNumber mn = new MissingNumber();
		System.out.println(mn.missingNumber(nums));

	}

}
