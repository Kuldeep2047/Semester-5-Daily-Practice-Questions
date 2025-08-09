// Last updated: 8/9/2025, 1:44:23 PM
class Solution {
    public int calculate(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int sign =1;
        int total =0;
        int number =0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                number = (number*10)+(ch-'0');
            }
            else if(ch == '-'){
                total += sign * number;
                sign =-1;
                number =0;
            }else if(ch == '+'){
                total += sign* number;
                sign = 1;
                number =0;
            }else if(ch == '('){
                st.push(total);
                st.push(sign);
                sign =1;
                number =0;
                total =0;

            }else if(ch == ')'){
                total += sign* number;
                int sig_st = st.pop();
                int num_st = st.pop();
                total *= sig_st;
                total += num_st;
                number =0;
            }
        }
        total += number*sign;
        return total;
    }
}