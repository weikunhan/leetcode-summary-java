class Solution {
    public boolean isMatch(String s, String p) {
        int rowEnd = p.length();
        int colEnd = s.length();
        boolean dpList[][] = new boolean[rowEnd + 1][colEnd + 1];
        dpList[rowEnd][colEnd] = true;
        boolean res = false;

        for (int i = rowEnd - 1; i >= 0; i--) {
            if (p.charAt(i) != '*') {
                break;
            }
            
            dpList[i][colEnd] = true;
        }
                                     
        for (int i = rowEnd - 1; i >= 0; i--) {
            for (int j = colEnd - 1; j >= 0 ; j--) {
                if (p.charAt(i) != '*') {
                    if (dpList[i + 1][j + 1] && (p.charAt(i) == s.charAt(j) || p.charAt(i) == '?')) {
                        dpList[i][j] = true;
                    }
                } else {
                    dpList[i][j] = (dpList[i + 1][j] || dpList[i][j + 1]);
                }
            }
        }
        
        res = dpList[0][0];
                                     
        return res;
    }
}