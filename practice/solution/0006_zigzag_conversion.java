class Solution {
    public String convert(String s, int numRows) {
        String[] valueList = new String[numRows];
        Arrays.fill(valueList, "");
        int count = 0;
        int sign = 1;
        String res = "";
        
        if (numRows == 1 || numRows >= s.length()) {
            res = s;
            
            return res;
        }  
        
        for (char c : s.toCharArray()) {
            valueList[count] += c;
            
            if (count == 0) {
                sign = 1;
            }
            
            if (count == numRows - 1) {
                sign = -1;
            }
            
            count += sign;
        }
        
        for (String temp : valueList) {
            res += temp;
        }
        
        return res;
    }
}