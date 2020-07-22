class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] valueList = new StringBuilder[numRows];
        int count = 0;
        int sign = 1;
        String res = "";
        
        if (numRows == 1 || numRows >= s.length()) {
            res = s;
            
            return res;
        }  
        
        for (int i = 0; i < valueList.length; i++) {
            valueList[i] = new StringBuilder("");   
        }
        
        for (char c : s.toCharArray()) {
            valueList[count].append(c);
            
            if (count == 0) {
                sign = 1;
            }
            
            if (count == numRows - 1) {
                sign = -1;
            }
            
            count += sign;
        }
        
        for (int i = 0; i < valueList.length; i++) {
            res += valueList[i];
        }
        
        return res;
    }
}