// Last updated: 9/26/2025, 1:18:25 PM
class Solution {
    public int secondHighest(String s) {
        return answer(s);
    }
    public int answer(String s){
        int f = -1;
        int se = -1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >='0' && ch<='9'){
                int n = ch-'0';
                if(n>f){
                    se = f;
                    f = n;
                }
                else if(n<f && n>se){
                    se = n;
                }
            }
        }
        return se;
    }
}