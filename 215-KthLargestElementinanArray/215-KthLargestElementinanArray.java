// Last updated: 8/20/2025, 12:18:37 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return(nums[nums.length-k]);

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // for(int n:nums){
        //     pq.add(n);
        // }
        // for(int i=1;i<k;i++){
        //     pq.remove();
        // }
        // return pq.peek();
        return Kth_Largest(nums,k);
        
    }
    public static int Kth_Largest(int[] arr,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
			
		}
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}
}