// Last updated: 8/9/2025, 1:36:38 PM
class Solution {
    public int longestPalindrome(String s, String t) {
        return answer(s,t);
    }
    public static int answer(String s,String t){
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        int n = s.length();
        int m = t.length();
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String s1 = s.substring(i,j);
                for(int k=0;k<m;k++){
                    for(int l=k+1;l<=m;l++){
                        String s2 = t.substring(k,l);
                        String a = s1+s2;
                        String b = s1;
                        String c = s2;
                        if(!a.isEmpty() && isPossible(a)){
                            ans = Math.max(ans,a.length());
                        }
                        if(!b.isEmpty() && isPossible(b)){
                            ans = Math.max(ans,b.length());
                        }
                        if(!c.isEmpty() && isPossible(c)){
                            ans = Math.max(ans,c.length());
                        }
                    }
                }
            }
        }
        
        // int ans =0;
        // for(int i=0;i<l1.size();i++){
        //     for(int j=0;j<l2.size();j++){
        //         String a = l1.get(i);
        //         String b = l2.get(j);
        //         String c = a+b;
        //         if(isPossible(c)){
        //             ans = Math.max(ans,c.length());
        //         }
        //     }
        // }
        return ans;
        
    }
    public static boolean isPossible(String str){
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}