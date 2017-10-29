/*Given two arrays, write a function to compute their intersection.
350Q Leetcode
Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.*/

package Array;

import java.util.ArrayList;
import java.util.HashMap;


public class IntersectionofTwoArraysII {
	
	public int[] intersect(int[] nums1, int[] nums2) {
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<nums1.length;i++){
			if(hmap.containsKey(nums1[i])){
				hmap.put(nums1[i], hmap.get(nums1[i])+1 );
			}else {
				hmap.put(nums1[i], 1);
			}
		}
		
		for(int i=0; i<nums2.length;i++){
			if(hmap.containsKey(nums2[i]) && hmap.get(nums2[i]) > 0){
				arr.add(nums2[i]);
				hmap.put(nums2[i],hmap.get(nums2[i])-1);				
			}
		}
		
		int[] result = new int[arr.size()];
		for(int i=0; i < result.length; i++){
			result[i] = arr.get(i);
		}
		return result;
	        
	    }

	public static void main(String[] args) {
	

	}

}
