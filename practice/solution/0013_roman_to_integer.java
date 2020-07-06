class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer>  valueDict= new HashMap<Character, Integer>();
        valueDict.put('I', 1);
        valueDict.put('V', 5);
        valueDict.put('X', 10);
        valueDict.put('L', 50);
        valueDict.put('C', 100);
        valueDict.put('D', 500);
        valueDict.put('M', 1000);
        int res = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (valueDict.get(s.charAt(i)) >= valueDict.get(s.charAt(i + 1))) {
                res += valueDict.get(s.charAt(i));
            } else {
                res -= valueDict.get(s.charAt(i));
            }
        }
             
        res += valueDict.get(s.charAt(s.length() - 1));
        
        return res;
    }
}