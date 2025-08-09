// Last updated: 8/9/2025, 1:44:27 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return(nums[nums.length-k]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n:nums){
            pq.add(n);
        }
        for(int i=1;i<k;i++){
            pq.remove();
        }
        return pq.peek();
        
    }
}