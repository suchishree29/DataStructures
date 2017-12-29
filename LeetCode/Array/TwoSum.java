class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            result[1] = i;
            result[0] = map.get(target - nums[i]);
            return result;
        }
        map.put(nums[i], i);
    }
    return result;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int x=0;x<nums.length;x++){
            for(int y=x+1;y<nums.length;y++){
                int z = nums[x] + nums[y];
                    if(z==target){
                        return new int[] {x,y};
                    }               
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
