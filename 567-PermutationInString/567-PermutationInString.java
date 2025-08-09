// Last updated: 8/9/2025, 1:42:52 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return permutation(s1,s2);
    }
    public static boolean permutation(String s1,String s2) {
		if(s1.length()>s2.length()) {
			return false;
		}
		int[] arr1 = new int[26];
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			arr1[ch-'a']++;
		}
		
		int i=0;
		int j = s1.length();
		while(j<=s2.length()) {
			if(ispossible(arr1,s2,i,j)) {
				return true;
			}
			i++;
			j++;
		}
		return false;
	}
	
	public static boolean ispossible(int[] arr1,String s2,int i,int j) {
		int[] arr2 = new int[26];
		for(int k=i;k<j;k++) {
			char ch = s2.charAt(k);
			arr2[ch-'a']++;
		}
		for(int k=0;k<arr2.length;k++) {
			if(arr1[k]!=arr2[k]) {
				return false;
			}
		}
		return true;
	}
}