class Solution {
    public int countBinarySubstrings(String s) {
        int left = 0;
        int right = 1;
        int res = 0;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                right++;
            } else {
                res += Math.min(left, right);
                left = right;
                right = 1;
            }
        }
        
        res += Math.min(left, right);
            
        return res;
    }
}