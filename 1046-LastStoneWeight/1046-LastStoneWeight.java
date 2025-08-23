// Last updated: 8/23/2025, 9:53:48 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        return answer(stones);
    }
    public int answer(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : arr){
            pq.add(n);
        }
        while(pq.size() >1){
            int y = pq.poll();
            int x = pq.poll();
            if(x != y){
                pq.add(y-x);
            }
        }
        if(pq.size()==1){
            return pq.poll();
        }else{
            return 0;
        }
    }
}