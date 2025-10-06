// Last updated: 10/6/2025, 3:14:03 PM
class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();

        int f = 1;
        for(int i =0 ;i<s.length() ;i++){
            char ch = s.charAt(i);
            if(s.charAt(i) == '6' && f==1){
                sb.append('9');
                f=0;
            }else{
                sb.append(ch);
            }
        }

        return Integer.parseInt(sb.toString());
        
    }
}