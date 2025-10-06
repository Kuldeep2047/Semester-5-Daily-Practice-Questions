// Last updated: 10/6/2025, 3:52:30 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        return answer(nums, k);
    }
    public static int answer(int[] arr ,int k){
        Arrays.sort(arr);
        int ans =1;
        int min = arr[0];
        
        for(int i=1;i<arr.length ;i++){
            if(arr[i] - min > k){
                ans++;
                min = arr[i];
            }
        }

        return ans;
        
    }
}