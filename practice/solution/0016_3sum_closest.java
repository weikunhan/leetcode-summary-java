class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int[] valueList = nums;
        Arrays.sort(valueList);
        int tempValue = Integer.MAX_VALUE;
        int res = 0;
        
        for (int i = 0; i < valueList.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            if (i > 0 && valueList[i] == valueList[i - 1]) {
                continue;
            }
            
            while (left < right) {                
                int sum_value = valueList[i] + valueList[left] + valueList[right];
                
                if (sum_value - target == 0) {
                    res = target;
                    
                    return res;
                } else if (sum_value - target > 0) {
                    right--;
                } else {
                    left++;
                }
            
                if (Math.abs(sum_value - target) < Math.abs(tempValue)) {
                    tempValue = sum_value - target;
                    res = sum_value;
                }
            }
        }
        
        return res;
    }
}