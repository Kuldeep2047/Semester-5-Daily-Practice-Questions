// Last updated: 11/9/2025, 12:41:44 PM
class Solution {
    public int minimumDistance(int[] nums) {
        return answer(nums);
    }
    public static int answer(int[] arr){
        int n = arr.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int ans = Integer.MAX_VALUE;

        for(int i=0 ;i<n ;i++){
            if( ! map.containsKey(arr[i])){
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }

        for(List<Integer> ll : map.values()){

            if(ll.size()>=3){
                for(int i=0 ;i+2 < ll.size() ;i++){
                    int d = 2 * (ll.get(i+2) - ll.get(i));

                    ans = Math.min(ans, d);
                }
            }
        }

        if(ans == Integer.MAX_VALUE){
            return -1;
        }else{
            return ans;
        }

    }
}