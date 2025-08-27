// Last updated: 8/27/2025, 12:47:18 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        // return answer(nums);
        return Longest_Consecutive(nums);
    }
    public static int Longest_Consecutive(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int ans =0;
		for(int i=0;i<arr.length;i++) {
			if(! set.contains(arr[i]-1)) {
				int c=0;
				int key = arr[i];
				while(set.contains(key)) {
					set.remove(key);
					c++;
					key++;
				}
				ans = Math.max(ans, c);
			}
		}
		return ans;
		
	}
    // public static int answer(int[] arr){
    //     int ans =0;
    //     Set<Integer> set = new HashSet<>();
    //     for(int n:arr){
    //         set.add(n);
    //     }

    //     for(int n:set){
    //         if(!set.contains(n-1)){
    //             // int start = n;
    //             int len =1;
    //             while(set.contains(n+1)){
    //                 len++;
    //                 n++;
    //             }

    //             ans = Math.max(ans,len);
    //         }
    //     }
    //     return ans;
    // }
}