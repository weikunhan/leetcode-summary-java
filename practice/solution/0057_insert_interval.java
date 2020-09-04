class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> leftValueList = new ArrayList<>();
        List<int[]> righValueList = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        List<int[]> res = new ArrayList<>();
        
        for (int[] interval : intervals) {
            if (interval[0] > end) {
                righValueList.add(interval);
            } else if (interval[1] < start) {
                leftValueList.add(interval);
            } else {
                start = Math.min(start, interval[0]);
                end = Math.max(end, interval[1]);
            }
        }
        
        res.addAll(leftValueList);
        res.add(new int[]{start, end});
        res.addAll(righValueList);
        
        return res.toArray(new int[res.size()][]);
    }
}