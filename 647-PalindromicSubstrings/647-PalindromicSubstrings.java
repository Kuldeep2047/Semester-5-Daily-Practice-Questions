// Last updated: 12/5/2025, 10:52:59 PM
1class Solution {
2    public int countSubstrings(String s) {
3        return Count_Palindrome(s);
4    }
5    public static int Count_Palindrome(String s) {
6		int odd =0;
7		
8		for(int axis=0; axis<s.length(); axis++) {
9			for(int orbit=0; axis-orbit>=0 && axis+orbit<s.length(); orbit++) {
10				if(s.charAt(axis-orbit) != s.charAt(axis+orbit)) {
11					break;
12				}
13				odd++;
14			}
15		}
16		int even=0;
17		for (double axis = 0.5; axis < s.length(); axis++) {
18			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
19				if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit))) {
20					break;
21				}
22				even++;
23			}
24		}
25		return odd+even;
26		
27	}
28}