// Last updated: 8/9/2025, 1:38:14 PM
class Solution {
    public int maximumValue(String[] strs) {
        return answer(strs);
        
    }
    public static int answer(String[] arr){
        int ans =0;
        int val=0;
        for(String str : arr){
            if(isDigit(str)){
                ans = Math.max(ans,Integer.parseInt(str));
            }else{
                ans = Math.max(ans,str.length());
            }
        }
        return ans;
    }
    public static boolean isDigit(String s){
        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}