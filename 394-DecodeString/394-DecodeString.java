// Last updated: 8/9/2025, 1:43:30 PM
class Solution {
    public String decodeString(String s) {
        return answer(s);
    }

    public static String answer(String s){

        Stack<String> st = new Stack<>();
        int num = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){

                num = num * 10 + (ch - '0');
            } else if(ch =='['){
                st.push(String.valueOf(num));
                st.push("[");
                num = 0;

            } else if(ch == ']'){

                StringBuilder sb = new StringBuilder();
                while(!st.peek().equals("[")) {
                    sb.insert(0, st.pop());
                }
                
                st.pop();
                int count = Integer.parseInt(st.pop());
                String repeated = sb.toString().repeat(count);
                st.push(repeated);
            } else {
                st.push(String.valueOf(ch)); 
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String str : st){
            ans.append(str);
        }

        return ans.toString();
    }
}