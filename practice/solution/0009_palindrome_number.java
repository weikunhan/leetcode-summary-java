class Solution {
    public boolean isPalindrome(int x) {
        long tempValue = 0;
        long count = x;
        Boolean res = false;
        
        if (x < 0) {
            
            return res;
        }
        
        while (count != 0) {
            tempValue = tempValue * 10 + count % 10;
            count /= 10;
        }
        
        if (x == tempValue) {
            res = true;
        }
        
        return res;
    }
}