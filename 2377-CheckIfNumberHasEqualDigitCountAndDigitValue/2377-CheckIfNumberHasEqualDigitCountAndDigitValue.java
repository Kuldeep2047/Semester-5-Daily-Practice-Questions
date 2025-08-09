// Last updated: 8/9/2025, 1:38:40 PM
class Solution {
    public boolean digitCount(String num) {
        return isEqual(num);
    }
    public static boolean isEqual(String num){
        int n = num.length();
        int[] freq = new int[10];
        for(int i=0;i<n;i++){
            freq[num.charAt(i)-'0']++;
        }
        for(int i=0;i<n;i++){
            int f = num.charAt(i)-'0';
            if(freq[i]!=f){
                return false;
            }
        }
        return true;
    }
}