// Last updated: 8/9/2025, 1:45:16 PM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
		List<String> ll = new ArrayList<>();
		Partitioning(s,ll,ans);
		return ans;
    }
    public static void Partitioning(String ques,List<String> ll,List<List<String>> ans) {
		if(ques.length()==0) {
//			System.out.println(ans);
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int cut=1;cut<=ques.length();cut++) {
			String s = ques.substring(0,cut);
			
			if(isPalindrome(s)) {
				ll.add(s);
				Partitioning(ques.substring(cut),ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}