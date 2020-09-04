class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] valueList = intervals;
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        List<int[]> res = new ArrayList<>();
        
        if (valueList.length == 0) {
            
            return res.toArray(new int[res.size()][]); 
        }
        
        res.add(valueList[0]);
        
        for (int i = 1; i < valueList.length; i++) {
            if (res.get(res.size() - 1)[1] >= valueList[i][0]) {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], valueList[i][1]);
            } else {
                res.add(valueList[i]);
            }               
        }
                                                      
        return res.toArray(new int[res.size()][]);
        
    }
}