// Last updated: 11/12/2025, 11:06:03 PM
class Solution {
    public String decodeString(String s) {
        return decode(s);
    }
    public static String decode(String s){
        int n = s.length();
        Stack<Integer> stNum = new Stack<>();
        Stack<String> st = new Stack<>();

        int currNum = 0;
        String currStr = "";

        for(int i=0 ;i<n ; i++){
            char ch = s.charAt(i);

            if(ch == '['){
                stNum.push(currNum);
                st.push(currStr);
                currStr = "";
                currNum = 0;
            }
            else if(ch == ']'){
                String prevStr = st.pop();
                int r = stNum.pop();

                StringBuilder sb = new StringBuilder(prevStr);
                for(int k=0; k<r ;k++){
                    sb.append(currStr);
                }

                currStr = sb.toString();
            }
            else if(ch>='0' && ch<='9'){
                currNum = currNum*10 + (ch-'0');
            }
            else{
                currStr += ch;
            }
        }
        return currStr;
    }
}