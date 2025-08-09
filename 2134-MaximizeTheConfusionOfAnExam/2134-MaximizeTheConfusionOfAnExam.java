// Last updated: 8/9/2025, 1:39:17 PM
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int flip_T = max_len(answerKey,k,'T');
		int flip_F = max_len(answerKey,k,'F');
		return (Math.max(flip_T, flip_F));

	}
	public static int max_len(String s, int k,char ch) {
		int si=0;
		int ei=0;
		int ans=0;
		int flip=0;
		while(ei<s.length()) {
			if(s.charAt(ei) == ch) {
				flip++;
			}
			while(flip>k && si<ei) {
				if(s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			
			ans = Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}
}