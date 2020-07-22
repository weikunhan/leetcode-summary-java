class Solution {
    public String[] valueList = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> res = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        res = dfs(digits);
        
        return res;
    }
    
    public List<String> dfs(String digits) {
        List<String> tempList = new ArrayList<>();
        
        if (digits.length() == 0) {
            
            return tempList;
        }
        
        if (digits.length() == 1) {
            String tempValue = valueList[digits.charAt(0) - '0'];
            
            for (char c : tempValue.toCharArray()) {
                tempList.add(String.valueOf(c));
            }
            
            return tempList;
        }
        
        String tempValue = valueList[digits.charAt(0) - '0'];
        
        for (char c : tempValue.toCharArray()) {
            for (String value : dfs(digits.substring(1))) {
                tempList.add(String.valueOf(c) + value);
            }
        }
                 
        return tempList;
    }
}