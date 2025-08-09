// Last updated: 8/9/2025, 1:43:17 PM
class Solution {
    public int compress(char[] chars) {
        return string_compression(chars);
    }
    public static int string_compression(char[] chars){
        
        String ans="";
        int i=0;
        while(i<chars.length){
            int count=0;
            char ch = chars[i];
            while(i<chars.length && ch==chars[i]){
                count++;
                i++;
            }
            if(count>0){
                ans += ch;
                if(count>1){
                    ans += count;
                }
            }
        }

        for (int j = 0; j < ans.length(); j++) {
            chars[j] = ans.charAt(j);
        }
        return ans.length();
    }
}