/*
169. Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

package string;

import java.util.HashMap;


import java.util.Map;

public class MajorityElement {
	
	public int majorityElement(int[] nums) {
        int maxElem = 0;
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
            else{
                hmap.put(nums[i],1);
            }
            
            if(hmap.get(nums[i]) > nums.length/2){
                    maxElem = nums[i];
                    break;
            }
        }
        return maxElem;
    }

	public static void main(String[] args) {
		MajorityElement me = new MajorityElement();
		
		int[] nums = {1,3,5,3,3,9,3,8,3};
		System.out.println(me.majorityElement(nums));

	}

}
