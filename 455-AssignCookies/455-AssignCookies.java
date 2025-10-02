// Last updated: 10/2/2025, 9:28:33 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        return Assign_Cookies(g, s);
    }
    public static int Assign_Cookies(int[] g, int[] s){
        int i = 0;
        int j =0;
        Arrays.sort(g);
        Arrays.sort(s);
        int ans =0;

        while(i<g.length && j<s.length){
            if(s[j] >= g[i]){
                ans++;
                i++;
            }
            j++;
        }

        return ans;
    }
}