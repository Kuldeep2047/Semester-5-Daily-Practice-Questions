// Last updated: 9/27/2025, 10:15:35 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return answer(nums ,k);
    }
    public int answer(int[] arr ,int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()< arr[i])
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}