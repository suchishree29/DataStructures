class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int begin = nums.length -1;
        int end = nums.length -1;
        
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != sorted[i]){
                begin = i;
                break;
            }
        }
        
        for(int i = nums.length-1; i>begin; i--){
            if(nums[i] != sorted[i]){
                end = i;
                break;
            }
        }
        
        return (end==begin)?0:(end-begin+1);
    }
}
