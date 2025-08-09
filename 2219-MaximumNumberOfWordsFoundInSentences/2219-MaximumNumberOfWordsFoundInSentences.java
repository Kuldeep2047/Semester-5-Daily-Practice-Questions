// Last updated: 8/9/2025, 1:39:04 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        return Max_Word(sentences);
    }
    public static int Max_Word(String[] arr){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            String sen = arr[i];
            int space =0;
            for(int j=0;j<sen.length();j++){
                if(sen.charAt(j)==' '){
                    space++;
                }
            }
            ans = Math.max(ans,space+1);
        }
        return ans;
    }
}