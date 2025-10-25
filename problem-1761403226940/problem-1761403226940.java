// Last updated: 10/25/2025, 8:10:26 PM
class Solution {
    public String lexSmallest(String s) {
        return answer(s);
    }

    public static String answer(String s){
        int n = s.length();
        String ans = s;

        for(int i=1 ;i<=n ;i++){
            String s1 = reverse(s,0,i-1);
            String s2 = reverse(s, n-i, n-1);

            if(s1.compareTo(ans) < 0){
                ans = s1;
            }
            if(s2.compareTo(ans)<0){
                ans = s2;
            }
        }

        return ans;
        
    }

    public static String reverse(String s, int l ,int r){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s,0,l);

        for(int i=r ;i>=l ;i--){
            char ch = s.charAt(i);
            sb.append(ch);

        }

        if(r+1 < n){
            sb.append(s.substring(r+1));
            
        }

        return sb.toString();
    }
}