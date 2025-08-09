// Last updated: 8/9/2025, 1:40:06 PM
class Solution {
    public int minDeletions(String s) {
        return answer(s);
    }
    public static int answer(String s){
        int n = s.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        Set<Integer> set = new HashSet<>();
        int c =0;

        // int idx = 0; 
        
        for (int i = 25; i >= 0; i--) {
            int f = freq[i];
            while (f > 0 && !set.add(f)) {
                f--;
                c++;
            }
        }
        return c;

    }
}