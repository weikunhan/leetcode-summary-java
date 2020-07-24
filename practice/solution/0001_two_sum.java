class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueDict = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int tempValue = target - nums[i];
            
            if (!valueDict.containsKey(nums[i])) {
                valueDict.put(tempValue, i);
            } else {
                res[0] = valueDict.get(nums[i]);
                res[1] = i;
                    
                return res;
            }
        }
        
        return res;
    }
}