class Solution {
    public String intToRoman(int num) {
        String mValueList[] = {"", "M", "MM", "MMM"};
        String cValueList[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String xValueList[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String iValueList[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String res = "";
        
        res += mValueList[num / 1000];
        res += cValueList[(num % 1000) / 100];
        res += xValueList[(num % 100) / 10];
        res += iValueList[num % 10];
        
        return res;
    }
}