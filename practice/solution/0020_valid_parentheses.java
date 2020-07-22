class Solution {
    public boolean isValid(String s) {
        Stack<Character> valueStack = new Stack<Character>();
        HashMap<Character, Character>  valueDict= new HashMap<Character, Character>();
        valueDict.put(']', '[');
        valueDict.put('}', '{');
        valueDict.put(')', '(');
        Boolean res = false;
        
        for (char c : s.toCharArray()) {
            if (!valueDict.containsKey(c)) {
                valueStack.push(c);
            } else {
                if (valueStack.isEmpty()) {
                    
                    return res;
                }
                
                char tempValue = valueStack.pop();
                
                if (valueDict.get(c) != tempValue) {
                    
                    return res;
                }
            }
        }
        
        if (valueStack.isEmpty()) {
            res = true;
        }
        
        return res;
    }
}