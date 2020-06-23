class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 1;
        Set<Character> valueDict = new HashSet<>();
        int res = 0;
        
        while (right < s.length() + 1) {
            char tempValue = s.charAt(right - 1);
            
            while (valueDict.contains(tempValue)) {
                valueDict.remove(s.charAt(left));
                left++;
            }
            
            valueDict.add(tempValue);
            res = Math.max(res, right - left);
            right++;
        }
        
        return res;
    }
}