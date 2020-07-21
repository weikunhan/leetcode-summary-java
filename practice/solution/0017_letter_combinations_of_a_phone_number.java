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
            
            for (int i = 0; i < tempValue.length(); i++) {
                tempList.add(tempValue.substring(i, i + 1));
            }
            
            return tempList;
        }
        
        String tempValue = valueList[digits.charAt(0) - '0'];
        
        for (int i = 0; i < tempValue.length(); i++) {
            for (String value : dfs(digits.substring(1))) {
                tempList.add(tempValue.substring(i, i + 1) + value);
            }
        }
                 
        return tempList;
    }
}