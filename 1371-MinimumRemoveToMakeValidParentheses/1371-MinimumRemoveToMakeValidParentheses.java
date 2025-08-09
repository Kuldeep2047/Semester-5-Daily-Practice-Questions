// Last updated: 8/9/2025, 1:41:06 PM
class Solution {
    public String minRemoveToMakeValid(String s) {
        return answer(s);
    }
    public static String answer(String s){
        
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        char[] arr = s.toCharArray();
        for(int i=0;i<n;i++){
            char br = arr[i];
            if(br == '('){
                st.push(i);
            }else if(br==')'){
                if(st.isEmpty()){
                    arr[i] = '@';    //mark as @ and delete this in the end
                }else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            arr[st.pop()] = '@';
        }


        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(arr[i] != '@'){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}