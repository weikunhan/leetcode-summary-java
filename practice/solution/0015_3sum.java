class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] valueList = nums;
        Arrays.sort(valueList);
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            if (i > 0 && valueList[i] == valueList[i - 1]) {
                continue;
            }
            
            while (left < right) {
                int sumValue = valueList[i] + valueList[left] + valueList[right];
                
                if (sumValue == 0) {
                    res.add(Arrays.asList(valueList[i], valueList[left], valueList[right]));
                    left++;
                    right--;
                    
                    while (left < right && valueList[left] == valueList[left - 1]) {
                        left++;
                    }
                    
                    while (left < right && valueList[right] == valueList[right + 1]) {
                        right--;
                    }
                } else if (sumValue < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return res; 
    }
}