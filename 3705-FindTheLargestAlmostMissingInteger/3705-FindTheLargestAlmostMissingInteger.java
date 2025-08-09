// Last updated: 8/9/2025, 1:37:04 PM
class Solution {
    public int largestInteger(int[] nums, int k) {
        return largest(nums,k);
    }
    public static int largest(int[] nums,int k){
        Set<Integer> set   = new HashSet<>();
        int n = nums.length;
        int[] count = new int[51];
        for(int i=0;i<k;i++){
            set.add(nums[i]);
        }
        for(int ele:set){
            count[ele]++;
        }

        for(int i=k;i<n;i++){
            set.clear();
            for(int j=i-k+1;j<=i;j++){
                set.add(nums[j]);
            }
            for(int ele:set){
                count[ele]++;
            }
        }
        for(n=50;n>=0;n--){
            if(count[n]==1){
                return n;
            }
        }
        return -1;
        
    }
}