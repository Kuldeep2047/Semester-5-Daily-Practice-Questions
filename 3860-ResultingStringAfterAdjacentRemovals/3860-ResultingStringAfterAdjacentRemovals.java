// Last updated: 8/9/2025, 1:36:23 PM
class Solution {
    public String resultingString(String s) {
        return answer(s);
    }
    public static String answer(String s){
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && isConsecutive(st.peek(),c)){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        // while(true){
        //     boolean found = false;
        //     for(int i=0;i<sb.length()-1;i++){
        //         char c1 = sb.charAt(i);
        //         char c2 = sb.charAt(i+1);
        //         if(isConsecutive(c1,c2)){
        //             sb.delete(i,i+2);
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         break;
        //     }
        // }
        
        return sb.toString();
    }
    public static boolean isConsecutive(char c1,char c2){
        int diff = Math.abs(c1-c2);
        return diff==1 || (c1=='a' && c2=='z') || (c1=='z' && c2=='a');
    }
}