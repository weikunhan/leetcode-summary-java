class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        String[] valueList = strs;
        Arrays.sort(valueList);
        String res = "";
        
        if (valueList.length == 0) {
            
            return res;
        }
        
        while (count < valueList[0].length() && valueList[0].charAt(count) == valueList[valueList.length - 1].charAt(count)) {
            count++;
        }
        
        res = valueList[0].substring(0, count);
        
        return res;
    }
}