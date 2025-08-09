// Last updated: 8/9/2025, 1:38:27 PM
class Solution {
    public String removeStars(String s) {
        return Remove_String(s);
    }
    public static String Remove_String(String s){
        char[] arr = s.toCharArray();
        int idx=0;
        for(char ch:arr){
            if(ch!='*'){
                arr[idx] = ch;
                idx++;
            }else{
                idx--;
            }
        }
        return new String(arr,0,idx);
    }
}