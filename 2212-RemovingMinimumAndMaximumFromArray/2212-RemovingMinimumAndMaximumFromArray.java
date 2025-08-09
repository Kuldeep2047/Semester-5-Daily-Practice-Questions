// Last updated: 8/9/2025, 1:39:07 PM
class Solution {
    public int minimumDeletions(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        int n = arr.length;
        // int c =0;
        int max_idx = 0;
        int min_idx =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                max_idx = i;
            }
            if(arr[i]<min){
                min = arr[i];
                min_idx =i;
            }
        }
        // if(max_idx < n/2){
        //     c += max_idx +1;
        // }
        int left = Math.min(min_idx, max_idx);
        int right = Math.max(min_idx, max_idx);

        int c1 = right + 1;                  // delete both from front
        int c2 = n - left;                   // delete both from back
        int c3 = (left + 1) + (n - right);      // one from front and  one from back
        // return c;

        return Math.min(c1, Math.min(c2, c3));
    }
}