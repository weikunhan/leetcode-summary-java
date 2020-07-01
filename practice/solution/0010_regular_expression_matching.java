class Solution {
    public boolean isMatch(String s, String p) {
        int rowEnd = p.length();
        int colEnd = s.length();
        boolean dpList[][] = new boolean[rowEnd + 1][colEnd + 1];
        dpList[0][0] = true;
        boolean res = false;

        for (int i = 1; i < rowEnd; i++) {
            dpList[i + 1][0] = (p.charAt(i) == '*' && dpList[i - 1][0]);
        }
                                     
        for (int i = 0; i < rowEnd; i++) {
            for (int j = 0; j < colEnd; j++) {
                if (p.charAt(i) != '*') {
                    if (dpList[i][j] && (p.charAt(i) == s.charAt(j) || p.charAt(i) == '.')) {
                        dpList[i + 1][j + 1] = true;
                    }
                } else {
                    dpList[i + 1][j + 1] = (dpList[i - 1][j + 1] || dpList[i][j + 1]);
                    
                    if (dpList[i + 1][j] && (p.charAt(i - 1) == s.charAt(j) || p.charAt(i - 1) == '.')) {
                        dpList[i + 1][j + 1] = true;
                    }
                }
            }
        }
        
        res = dpList[rowEnd][colEnd];
                                     
        return res;
    }
}