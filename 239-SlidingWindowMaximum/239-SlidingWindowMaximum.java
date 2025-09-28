// Last updated: 9/28/2025, 2:33:26 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // return answer(nums,k);
        return window_Maximum(nums, k);
    }

    public static int[] window_Maximum(int[] arr ,int k){
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        int[] ans = new int[n-k+1];

        for(int i=0;i<k;i++){
            while( ! dq.isEmpty() && arr[i]> arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.add(i);
        }
        int idx =0;
        for(int i=k ;i<n;i++){
            ans[idx++] = arr[dq.peekFirst()];

            //remove element from deque which is not part of current window
            while( !dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.pollFirst();
            }

            //remove element index jo deque me element se bade ho
            while( ! dq.isEmpty() && arr[i]> arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.add(i);
        }
        ans[idx++] = arr[dq.peekFirst()];

        return ans;
    }



    // public static int[] answer(int[] nums,int k){
    //     int n = nums.length;
    //     int[] ans= new int[n - k + 1];
    //     Deque<Integer> dq = new ArrayDeque<>();

    //     for (int i = 0; i < n; i++) {
    //         while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
    //             dq.pollFirst();
    //         }
    //         while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
    //             dq.pollLast();
    //         }
    //         dq.offerLast(i);
    //         if (i >= k - 1) {
    //             ans[i - k + 1] = nums[dq.peekFirst()];
    //         }
    //     }
    //     return ans;
    // }
}