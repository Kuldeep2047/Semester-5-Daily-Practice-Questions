// Last updated: 9/22/2025, 8:49:37 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        return answer(nums);
    }
    public int answer(int[] arr){
        // int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for(int n:arr){
            map.put(n, map.getOrDefault(n,0)+1);
            max = Math.max(max, map.get(n));

        }
        int c =0;
        for(int a : map.keySet()){
            if(map.get(a) == max){
                c += map.get(a);
            }
        }
        return c;
    }
}