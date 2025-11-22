// Last updated: 11/22/2025, 8:16:02 PM
class Solution {
    public int totalWaviness(int num1, int num2) {
        return answer(num1, num2);
    }
    public static int answer(int n1, int n2){
        int ans =0;

        for(int i=n1 ;i<=n2 ;i++){
            int w =0;
            String s = String.valueOf(i);

            if(s.length() >=3){
                
                for(int j=1 ;j<s.length()-1 ;j++){
                    char m = s.charAt(j);
                    char r = s.charAt(j+1);
                    char l = s.charAt(j-1);
                    if((m<l && m <r) || (m>l && m>r)){
                        w++;
                    }
                }

                ans += w;
            }
        }
        return ans;
    }
}