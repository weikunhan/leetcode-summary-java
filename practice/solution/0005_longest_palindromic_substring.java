class Solution {
    public String longestPalindrome(String s) {
        int rowEnd = s.length();
        int colEnd = s.length();
        int maxLenght = 0;
        String res = "";
        boolean dpList[][] = new boolean[rowEnd][colEnd];
        
        for (int i = 0; i < rowEnd; i++) {
            dpList[i][i] = true;
            
            if (i < rowEnd - 1 && s.charAt(i) == s.charAt(i + 1)) {
                 dpList[i][i + 1] = true;
            }
        }
        
        for (int i = rowEnd - 2; i >= 0; i--) {
            for (int j = i + 2; j < colEnd; j++) {
                dpList[i][j] = (dpList[i + 1][j - 1] == true && s.charAt(i) == s.charAt(j));
            }
        }
        
        for (int i = 0; i < rowEnd; i++) {
            for (int j = i; j < colEnd; j++) {
                int tempValue = j - i + 1;
                
                if (dpList[i][j] == true && maxLenght < tempValue) {
                    maxLenght = tempValue;
                    res = s.substring(i, i + maxLenght);
                }
            }
        }
            
        return res;
    }
}