// Last updated: 11/16/2025, 2:21:16 PM
class Solution {
    public int minLengthAfterRemovals(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int n = s.length();
        int a=0;
        int b=0;
        for(int i=0 ;i<n ;i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                a++;
            }else{
                b++;
            }
        }

        int ans = Math.abs(a-b);
        return ans;
    }
}