// Last updated: 8/9/2025, 1:43:22 PM
class Solution {
    public String originalDigits(String s) {
        return Reconstruct_digit(s);
    }
    public static String Reconstruct_digit(String s){
        int[] freq = new int[26];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-'a']++;
		}
//		for (int i = 0; i < freq.length; i++) {
//			System.out.println(i+" "+freq[i]);
//		}
		int[] count = new int[10];
		count[0] = freq['z'-'a'];
		count[2] = freq['w'-'a'];
		count[4] = freq['u'-'a'];
		count[6] = freq['x'-'a'];
		count[8] = freq['g'-'a'];
		
		count[1] = freq['o'-'a']- count[0]-count[2]-count[4];
		count[3] = freq['h'-'a']- count[8];
		count[5] = freq['f'-'a']- count[4];
		count[7] = freq['s'-'a']-count[6];
		count[9] = (freq['n'-'a'] - count[1]-count[7])/2;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<10;i++) {
			while(count[i]-- >0) {
				sb.append(i);
			}
		}
        return sb.toString();
    }
}