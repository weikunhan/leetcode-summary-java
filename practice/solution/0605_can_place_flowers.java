class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        List<Integer> valueList = new ArrayList<>();
        boolean res = false;
        
        for (int tmep : flowerbed) {
            valueList.add(tmep);
        }
        
        valueList.add(0, 0);
        valueList.add(0);
        
        for (int i = 1; i < valueList.size() - 1; i++) {
            if (valueList.get(i - 1) == 0 && valueList.get(i) == 0 && valueList.get(i + 1) == 0) {
                valueList.set(i, 1);
                count++;
            }
        }
        
        if (count >= n) {
            res = true;
        }
        
        return res;
    }
}