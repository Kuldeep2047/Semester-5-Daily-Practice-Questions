// Last updated: 8/9/2025, 1:40:22 PM
class Solution {
    public int numSplits(String s) {
        return Split_String(s);
    }
    public static int Split_String(String s){
        List<Character> left = new ArrayList<>();
        List<Character> right = new ArrayList<>();
        int n = s.length();
        int[] rcount = new int[n];
        int[] lcount = new int[n];
        for(int i=0;i<n;i++){
            if( !left.contains(s.charAt(i))){
                left.add(s.charAt(i));
            }
            if( !right.contains(s.charAt(n-i-1))){
                right.add(s.charAt(n-i-1));
            }

            lcount[i] = left.size();
            rcount[n-i-1] = right.size();
        }
        int ans=0;
        for(int i=1;i<n;i++){
            if(lcount[i-1] == rcount[i]){
                ans++;
            }
        }
        return ans;
    }
}