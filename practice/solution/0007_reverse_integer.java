class Solution {
    public int reverse(int x) {
        int res = 0;

        while (x != 0) {
            int tempValue = res * 10 +  x % 10;
            
            if ((tempValue - x % 10) / 10 != res) {
                res = 0;
                    
                return res;
            }
            
            res = tempValue;
            x = x / 10;
        }

        return res;
    }
}
        