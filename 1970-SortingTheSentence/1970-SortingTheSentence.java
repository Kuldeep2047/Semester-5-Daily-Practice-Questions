// Last updated: 8/9/2025, 1:39:26 PM
class Solution {
    public String sortSentence(String s) {
        int n = s.length();
        String[] arr = s.split(" ");
        String[] ans = new String[n];
        for(int i=0;i<arr.length;i++){
            String st = arr[i];
            int j = st.charAt(st.length()-1)-'1';
            ans[j] = st.substring(0,st.length()-1);
        }
        s ="";
        for(int i=0;i<arr.length;i++){
            s += ans[i];
            if(i!=arr.length-1){
                s+=" ";
            }
        }
        return s;
    }
}