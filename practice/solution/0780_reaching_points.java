class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        Boolean res = false;
        
        while (tx >= sx && ty >= sy) {
            if (tx > ty) {
                if (ty == sy) {
                    res = (tx - sx) % ty == 0;
                    
                    return res;
                }
                
                tx %= ty;
            } else {
                if (tx == sx) {
                    res = (ty - sy) % tx == 0;
                    
                    return res;
                }
                
                ty %= tx;
            }
        }
        
        res = tx == sx && ty == sy;
            
        return res;
    }
}