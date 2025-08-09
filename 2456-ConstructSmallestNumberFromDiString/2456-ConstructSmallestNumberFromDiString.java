// Last updated: 8/9/2025, 1:38:26 PM
class Solution {
    public String smallestNumber(String pattern) {
        return Construct_Smallest_Number(pattern);
    }
    public static String Construct_Smallest_Number(String str) {
		int[] ans = new int[str.length()+1];
		int c =1;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i <= str.length(); i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				ans[i] = c;
				c++;
				while(!st.isEmpty()) {
					ans[st.pop()]=c;
					c++;
				}
			}else {
				st.push(i);
			}
		}
		String s="";
		for(int num:ans) {
			s+=num;
		}
		return s;
	}
}