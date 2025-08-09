// Last updated: 8/9/2025, 1:40:36 PM
class Solution {
    public int maxPower(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int c=1;
        int n = s.length();
        int ans =0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)== s.charAt(i+1)){
                c++;
            }else{
                ans = Math.max(ans,c);
                c=1;
            }
        }
        ans = Math.max(ans,c);
        return ans;
    }
}