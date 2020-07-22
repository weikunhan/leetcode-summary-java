class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int[] valueList = nums;
        Arrays.sort(valueList);
        List<List<Integer>> res = new ArrayList<>();
        
       for (int i = 0; i < valueList.length; i++) {
           if (i > 0 && valueList[i] == valueList[i - 1]) {
                continue;
            }
           
           for (int j = i + 1; j < valueList.length; j++) {
               int left = j + 1;
               int right = valueList.length - 1;
               
                if (j > i + 1 && valueList[j] == valueList[j - 1]) {
                    continue;
                }
               
                while (left < right) {
                    int sumValue = valueList[left] + valueList[right] + valueList[i] + valueList[j];
                    
                    if (sumValue == target) {
                        res.add(Arrays.asList(valueList[i], valueList[j], valueList[left], valueList[right]));
                        left++; 
                        right--;
                        
                        while (left < right && valueList[left] == valueList[left - 1]) {          
                            left++;
                        }
                        
                        while (left < right && valueList[right] == valueList[right + 1]) {
                            right--;
                        }
                    } else if (sumValue < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return res;
    }
}