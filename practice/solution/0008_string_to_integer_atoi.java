class Solution {
    public int myAtoi(String str) {
        Boolean sign = true;
        int res = 0;
        int count = 0;
        
        while (count < str.length()) {
            if (Character.isWhitespace(str.charAt(count))) {
                count++;
            } else {
                break;
            }
        }
        
        if (count == str.length()) {
            
            return res;
        }
        
        if (str.charAt(count) == '+') {
            count++;
        } else if (str.charAt(count) == '-') {
            sign = false;
            count++;
        }
        
        while (count < str.length() && Character.isDigit(str.charAt(count))) {
            int tempValue = str.charAt(count) - '0';
            
            if (res > (Integer.MAX_VALUE - tempValue) / 10 || res < (Integer.MIN_VALUE + tempValue) / 10) {
                if (sign) {
                    res = Integer.MAX_VALUE;
                } else {
                    res = Integer.MIN_VALUE;
                }
                
                return res;
            }
            
            if (sign) {
                res = res * 10 + tempValue;
            } else {
                res = res * 10 - tempValue;
            }
            
            count++;
        }
        
        return res;
    }
}