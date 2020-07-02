class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        
        while (left < right) {
            int tempValue = Math.min(height[left], height[right]);
            res = Math.max(res, (right - left) * tempValue);
            
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        
        return res;
    }
}