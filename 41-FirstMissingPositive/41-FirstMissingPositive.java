// Last updated: 9/26/2025, 2:58:39 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        // return answer(nums);
        return cyclic_sort(nums);
    }

    public int cyclic_sort(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i]>0 && nums[i]<=n && nums[i] != nums[nums[i]-1]){
                int idx = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }

    public int answer(int[] arr){
        Set<Integer> set = new HashSet<>();
        int ans = 1;
        for(int n:arr){
            set.add(n);
        }
        while(true){
            if( ! set.contains(ans)){
                return ans;

            }
            ans++;
        }
    }
}