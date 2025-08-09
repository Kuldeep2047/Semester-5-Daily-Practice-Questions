// Last updated: 8/9/2025, 1:37:49 PM
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        return answer(nums);
    }
    public static int[] answer(int[] arr){
        int n = arr.length;
        Set<Integer> s1 = new HashSet<>();
        int[] pre = new int[n];
        for(int i=0;i<n;i++){
            s1.add(arr[i]);
            pre[i] = s1.size();
        }
        s1.clear();
        int[] suff = new int[n];
        for(int i=n-1;i>=0;i--){
            suff[i] = s1.size();
            s1.add(arr[i]);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = pre[i] - suff[i];
        }
        return ans;
    }
}