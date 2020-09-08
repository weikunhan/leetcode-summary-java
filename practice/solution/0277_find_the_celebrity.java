/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        int res = 0;
        
        for (int i = 1; i < n; i++) {
            if (knows(res, i)) {
                res = i;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (!knows(i, res) || (i != res && knows(res, i))) {
                res = -1;
                
                return res;
            }
        }
        
        return res;
    }
}
