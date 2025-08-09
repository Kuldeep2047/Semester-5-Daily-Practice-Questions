// Last updated: 8/9/2025, 1:38:02 PM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        while(left<=right){
            String str = words[left];
            if(isPossible(str)){
                c++;
            }
            left++;
        }
        return c;
        
    }
    public static boolean isPossible(String str){
        char start = str.charAt(0);
        char end = str.charAt(str.length()-1);
        char[] arr = {'a','e','i','o','u'};
        int f1 =0;
        int f2 =0;
        for(char ch:arr){
            if(ch==start){
                f1=1;
                break;
            }
        }
        for(char ch:arr){
            if(ch==end){
                f2=1;
                break;
            }
        }
        if(f1==1 && f2==1){
            return true;
        }
        return false;
    }
}