// Last updated: 8/9/2025, 1:37:15 PM
class Solution {
    public int minimumLength(String s) {
        return min_length_string(s);
    }
    public static int min_length_string(String s){
        int[] arr = new int[26];
        int c=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 !=0){
                c += 1;
            }else if(arr[i]!=0){
                c +=2;
            }
        }
        return c;
    }
}