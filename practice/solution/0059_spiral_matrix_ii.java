class Solution {
    public int[][] generateMatrix(int n) {
        int count = 1;
        int rowStart = 0;
        int rowEnd = n;
        int colStart = 0;
        int colEnd = n;
        int res[][] = new int[rowEnd][colEnd];
        
        while (count <= n * n) {
            for (int i = colStart; i < colEnd; i++) {
                res[rowStart][i] = count;
                count++;
            }
            
            rowStart++;
            
            for (int i = rowStart; i < rowEnd; i++) {
                res[i][colEnd - 1] = count;
                count++;
            }
            
            colEnd--;
            
            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    res[rowEnd - 1][i] = count;
                    count++;
                }    
            }
            
            rowEnd--;
            
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    res[i][colStart] = count;
                    count++;
                }
            }
            
            colStart++;
        }
        
        return res;
    }
}