// Last updated: 8/9/2025, 1:41:18 PM
class Solution {
    public int maxNumberOfBalloons(String text) {
        return answer(text);
    }
    public static int answer(String text){
        int arr[] = new int[26];
        for(int i=0;i<text.length();i++){
            arr[text.charAt(i)-'a']++;
        }
        int b = arr['b'-'a'];
        int a = arr['a'-'a'];
        int l = arr['l'-'a']/2;
        int o = arr['o'-'a']/2;
        int n = arr['n'-'a'];

        int ans = Math.min(Math.min(Math.min(Math.min(b,a),l),o),n);
        return ans;

    }
}