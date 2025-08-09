// Last updated: 8/9/2025, 1:38:49 PM
class Solution {
    public int minSteps(String s, String t) {
        return answer(s,t);
    }
    public static int answer(String s,String t){
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            // if(arr[t.charAt(i)-'a']==0){
            //     arr[t.charAt(i)-'a']++;
            // }else{
                arr[t.charAt(i)-'a']--;
            // }
        }
        int c=0;
        for(int n:arr){
            // if(n>0){
                c+=Math.abs(n);
            // }
        }
        return c;
    }
}