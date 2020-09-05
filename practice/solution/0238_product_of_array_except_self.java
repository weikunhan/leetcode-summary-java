class Solution {
    public int[] productExceptSelf(int[] nums) {
        int tempValue = 1;
        int[] res = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            res[i] = tempValue;
            tempValue *= nums[i];
        }
        
        tempValue = 1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= tempValue;
            tempValue *= nums[i];
        }
        
        return res;
    }
}