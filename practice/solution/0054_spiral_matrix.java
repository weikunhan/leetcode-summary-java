class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length;
        int colEnd = 0;
        List<Integer> res = new ArrayList<>();
        
        if (matrix.length == 0) {
            
            return res;
        }
        
        colEnd = matrix[0].length;
        
        while (rowStart < rowEnd && colStart < colEnd) {
            for (int i = colStart; i < colEnd; i++) {
                res.add(matrix[rowStart][i]);
            }
            
            rowStart++;
            
            for (int i = rowStart; i < rowEnd; i++) {
                res.add(matrix[i][colEnd - 1]);
            }
            
            colEnd--;
            
            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    res.add(matrix[rowEnd - 1][i]);
                }
            }
            
            rowEnd--;
            
            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    res.add(matrix[i][colStart]);
                }
            }
            
            colStart++;
        }
        
        return res;
    }
}