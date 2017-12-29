class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxcount = 0;
        int count = 1;
        if(nums.length == 0){
            return 0;
        }       
        for(int i = 0; i< nums.length -1 ; i++){ 
                if(nums[i] < nums[i+1]){
                    count++;
                    maxcount=Math.max(maxcount,count);
                } else if(nums[i] >= nums[i+1]){
                    count = 1;   
                }
        }
        return Math.max(maxcount,1);
    }
}
